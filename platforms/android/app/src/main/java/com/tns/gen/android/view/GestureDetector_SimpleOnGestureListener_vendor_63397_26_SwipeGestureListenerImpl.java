/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.android.view;

public class GestureDetector_SimpleOnGestureListener_vendor_63397_26_SwipeGestureListenerImpl extends android.view.GestureDetector.SimpleOnGestureListener implements com.tns.NativeScriptHashCodeProvider {
	public GestureDetector_SimpleOnGestureListener_vendor_63397_26_SwipeGestureListenerImpl(){
		super();
		com.tns.Runtime.initInstance(this);
	}

	public boolean onDown(android.view.MotionEvent param_0)  {
		java.lang.Object[] args = new java.lang.Object[1];
		args[0] = param_0;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onDown", boolean.class, args);
	}

	public boolean onFling(android.view.MotionEvent param_0, android.view.MotionEvent param_1, float param_2, float param_3)  {
		java.lang.Object[] args = new java.lang.Object[4];
		args[0] = param_0;
		args[1] = param_1;
		args[2] = param_2;
		args[3] = param_3;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onFling", boolean.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
