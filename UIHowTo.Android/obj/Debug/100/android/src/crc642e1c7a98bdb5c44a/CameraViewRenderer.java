package crc642e1c7a98bdb5c44a;


public class CameraViewRenderer
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.UI.Views.CameraViewRenderer, Xamarin.CommunityToolkit", CameraViewRenderer.class, __md_methods);
	}


	public CameraViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CameraViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.CameraViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public CameraViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CameraViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.CameraViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CameraViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CameraViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.CameraViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CameraViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CameraViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.CameraViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
