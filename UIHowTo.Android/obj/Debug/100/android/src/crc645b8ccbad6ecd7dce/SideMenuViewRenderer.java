package crc645b8ccbad6ecd7dce;


public class SideMenuViewRenderer
	extends crc643f46942d9dd1fff9.VisualElementRenderer_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.Android.UI.Views.SideMenuViewRenderer, Xamarin.CommunityToolkit", SideMenuViewRenderer.class, __md_methods);
	}


	public SideMenuViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SideMenuViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.Android.UI.Views.SideMenuViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SideMenuViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SideMenuViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.Android.UI.Views.SideMenuViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SideMenuViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SideMenuViewRenderer.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.Android.UI.Views.SideMenuViewRenderer, Xamarin.CommunityToolkit", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


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
