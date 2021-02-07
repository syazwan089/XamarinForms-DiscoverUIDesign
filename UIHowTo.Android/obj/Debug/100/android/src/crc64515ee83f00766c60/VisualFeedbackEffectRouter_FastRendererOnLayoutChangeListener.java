package crc64515ee83f00766c60;


public class VisualFeedbackEffectRouter_FastRendererOnLayoutChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnLayoutChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutChange:(Landroid/view/View;IIIIIIII)V:GetOnLayoutChange_Landroid_view_View_IIIIIIIIHandler:Android.Views.View/IOnLayoutChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.Android.Effects.VisualFeedbackEffectRouter+FastRendererOnLayoutChangeListener, Xamarin.CommunityToolkit", VisualFeedbackEffectRouter_FastRendererOnLayoutChangeListener.class, __md_methods);
	}


	public VisualFeedbackEffectRouter_FastRendererOnLayoutChangeListener ()
	{
		super ();
		if (getClass () == VisualFeedbackEffectRouter_FastRendererOnLayoutChangeListener.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.Android.Effects.VisualFeedbackEffectRouter+FastRendererOnLayoutChangeListener, Xamarin.CommunityToolkit", "", this, new java.lang.Object[] {  });
	}


	public void onLayoutChange (android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8)
	{
		n_onLayoutChange (p0, p1, p2, p3, p4, p5, p6, p7, p8);
	}

	private native void n_onLayoutChange (android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8);

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
