package crc64515ee83f00766c60;


public class PlatformTouchEffect_AccessibilityListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener,
		android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAccessibilityStateChanged:(Z)V:GetOnAccessibilityStateChanged_ZHandler:Android.Views.Accessibility.AccessibilityManager/IAccessibilityStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onTouchExplorationStateChanged:(Z)V:GetOnTouchExplorationStateChanged_ZHandler:Android.Views.Accessibility.AccessibilityManager/ITouchExplorationStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.Android.Effects.PlatformTouchEffect+AccessibilityListener, Xamarin.CommunityToolkit", PlatformTouchEffect_AccessibilityListener.class, __md_methods);
	}


	public PlatformTouchEffect_AccessibilityListener ()
	{
		super ();
		if (getClass () == PlatformTouchEffect_AccessibilityListener.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.Android.Effects.PlatformTouchEffect+AccessibilityListener, Xamarin.CommunityToolkit", "", this, new java.lang.Object[] {  });
	}


	public void onAccessibilityStateChanged (boolean p0)
	{
		n_onAccessibilityStateChanged (p0);
	}

	private native void n_onAccessibilityStateChanged (boolean p0);


	public void onTouchExplorationStateChanged (boolean p0)
	{
		n_onTouchExplorationStateChanged (p0);
	}

	private native void n_onTouchExplorationStateChanged (boolean p0);

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
