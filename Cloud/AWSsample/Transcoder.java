import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.services.elastictranscoder.*;
import com.amazonaws.services.elastictranscoder.model.*;

public class Transcoder {
	static AmazonElasticTranscoder transCoder;
	public static AWSCredentials credentials;
	
	private static void init() throws Exception {
		credentials = new ClasspathPropertiesFileCredentialsProvider()
				.getCredentials();
		System.out.println(credentials.getAWSAccessKeyId() + "   "
				+ credentials.getAWSSecretKey());
		transCoder = new AmazonElasticTranscoderClient(credentials);
		transCoder.setEndpoint("elastictranscoder.us-east-1.amazonaws.com");
	}

	public static void DeletePipe(String id) {
		DeletePipelineRequest deletePipelineRequest = new DeletePipelineRequest();
		deletePipelineRequest.setId(id);
		DeletePipelineResult deleResult = transCoder
				.deletePipeline(deletePipelineRequest);
	}

	public static void CancelJ(String id) {
		CancelJobRequest cancelJobRequest = new CancelJobRequest();
		cancelJobRequest.setId(id);
		CancelJobResult cancelJob = transCoder.cancelJob(cancelJobRequest);
	}

	public static void CreatePipe(String pipename, String inbucket,
			String outbucket) {
		CreatePipelineRequest createPipelineRequest = new CreatePipelineRequest();
		createPipelineRequest.setName(pipename);
		createPipelineRequest.setInputBucket(inbucket);
		createPipelineRequest.setOutputBucket(outbucket);

		Notifications notifications = new Notifications();
		notifications
				.setWarning("arn:aws:iam::275497846809:role/Elastic_Transcoder_Default_Role");
		notifications
				.setProgressing("arn:aws:iam::275497846809:role/Elastic_Transcoder_Default_Role");
		notifications
				.setError("arn:aws:iam::275497846809:role/Elastic_Transcoder_Default_Role");
		notifications
				.setCompleted("arn:aws:iam::275497846809:role/Elastic_Transcoder_Default_Role");
		createPipelineRequest.setNotifications(notifications);
		createPipelineRequest
				.setRole("arn:aws:iam::275497846809:role/Elastic_Transcoder_Default_Role");

		CreatePipelineResult createPipelineResult = transCoder
				.createPipeline(createPipelineRequest);
		Pipeline p = createPipelineResult.getPipeline();
		System.out.println("----------New Pipeline----------");
		System.out.println("Id : " + p.getId());
		System.out.println("  Name : " + p.getName());
		System.out.println("  Status : " + p.getStatus());
	}

	public static void ListPipe() {
		ListPipelinesRequest listPipelineRequest = new ListPipelinesRequest();
		ListPipelinesResult listPipelineResult = transCoder
				.listPipelines(listPipelineRequest);
		List<Pipeline> pipelines = listPipelineResult.getPipelines();

		// System.out.println(pipelines.size());

		System.out.println("----------Pipeline List----------");
		for (Pipeline pipeline : pipelines) {
			System.out.println("Id : " + pipeline.getId());
			System.out.println("  Name : " + pipeline.getName());
			System.out.println("  Role : " + pipeline.getRole());
		}
	}

	public static void CreateJob(String inputk, String outputk,
			String presetid, String pipelineid) {
		CreateJobRequest createJobRequest = new CreateJobRequest();
		JobInput input = new JobInput();
		input.setKey(inputk);
		input.setAspectRatio("auto");
		input.setContainer("auto");
		input.setFrameRate("auto");
		input.setInterlaced("auto");
		input.setResolution("auto");

		CreateJobOutput output = new CreateJobOutput();
		output.setRotate("auto");
		output.setKey(outputk);
		output.setPresetId(presetid);
		// output.setSegmentDuration(null);
		output.setThumbnailPattern("");

		createJobRequest.setPipelineId(pipelineid);
		createJobRequest.setRequestCredentials(credentials);
		createJobRequest.setInput(input);
		createJobRequest.setOutput(output);
		createJobRequest.setOutputKeyPrefix("out_");

		try {
			CreateJobResult createJobResult = transCoder
					.createJob(createJobRequest);
			Job j = createJobResult.getJob();

			System.out.println("----------New Job----------");
			System.out.println("Id : " + j.getId());
		} catch (AmazonServiceException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		init();
		// CreatePipe("test3","kevin1bucket","kevin1bucket");
		// DeletePipe("1368983592435-856y6h");
		ListPipe();
		// 1351620000001-000060 presetId
		// CreateJob("xiaoxin.mp4","test1", "1351620000001-000060",
		// "1368979837522-dqb90z");
		// ListJob();
		// CancelJ("1368990994481-ouu2n4");
		/*
		 * Job j = createJobResult.getJob();
		 * System.out.println("----------New Job----------");
		 * System.out.println("Id : "+j.getId());
		 */
	}

	public static void ListJob() {
		ListJobsByPipelineRequest listJobsByPipelineRequest = new ListJobsByPipelineRequest();
		listJobsByPipelineRequest.setPipelineId("1368979837522-dqb90z");
		ListJobsByPipelineResult listJobsByPipelineResult = transCoder
				.listJobsByPipeline(listJobsByPipelineRequest);
		List<Job> jobs = listJobsByPipelineResult.getJobs();
		for (Job job : jobs) {
			System.out.println("  Id : " + job.getId());
			JobInput jobInput = job.getInput();
			System.out.println("    JobInput");
			System.out.println("      AspectRatio : "
					+ jobInput.getAspectRatio());
			System.out.println("      Container : " + jobInput.getContainer());
			System.out.println("      FrameRate : " + jobInput.getFrameRate());
			System.out
					.println("      Interlaced : " + jobInput.getInterlaced());
			System.out.println("      Key : " + jobInput.getKey());
			System.out
					.println("      Resolution : " + jobInput.getResolution());
			JobOutput jobOutput = job.getOutput();
			System.out.println("    JobOutput");
			System.out.println("      Key : " + jobOutput.getKey());
			System.out.println("      PresetId : " + jobOutput.getPresetId());
			System.out.println("      Rotate : " + jobOutput.getRotate());
			System.out.println("      Status : " + jobOutput.getStatus());
			System.out.println("      StatusDetail : "
					+ jobOutput.getStatusDetail());
			System.out.println("      ThumbnailPattern : "
					+ jobOutput.getThumbnailPattern());
		}
	}
}

/*
 * System.out.println("----------Preset List----------"); ListPresetsRequest
 * listPresetsRequest = new ListPresetsRequest(); ListPresetsResult
 * listPresetsResult = transCoder.listPresets(listPresetsRequest); List<Preset>
 * presets = listPresetsResult.getPresets();
 * 
 * int presetSize = presets.size()-1; Preset lastPre = presets.get(presetSize);
 * System.out.println("$$$$$$" + lastPre);
 */

/*
 * for (Preset preset : presets) { System.out.println("Id : " + preset.getId());
 * System.out.println("  Name : " + preset.getName());
 * System.out.println("  Description : " + preset.getDescription());
 * System.out.println("  Type : " + preset.getType());
 * System.out.println("  Thumbnails : " + preset.getThumbnails());
 * System.out.println("  Video : " + preset.getVideo());
 * System.out.println("  Audio : " + preset.getAudio());
 */

// }
