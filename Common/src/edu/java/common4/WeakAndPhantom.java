package edu.java.common4;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class WeakAndPhantom {
	public static void main(String... args) throws Exception{
		String str = new String("test");
		ReferenceQueue rq = new ReferenceQueue();
		PhantomReference pr = new PhantomReference (str, rq);
		str = null;
		System.out.println(pr.get());
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll() == pr);
	}
}

/*
* A way to use Phantom:
* //take the phantom object
* obj = wr.get()
*  //if the object is null
* if (obj == null){
* 	//new a object, use this phantom reference
* 	wr = new WeakReference(recreateIt());
* 	obj = wr.get();
* }
*......//code for obj
* //set obj to null, for the rescource saving
* obj=null;
* 
*/

/*
 * Another better way to use Phantom:
 * obj = wr.get();
 * if(obj == null){
 * 	obj = recreateIt();
 *  wr = new WeakReference(obj);
 *}
 *.......//operate obj
 *obj = null;
 */