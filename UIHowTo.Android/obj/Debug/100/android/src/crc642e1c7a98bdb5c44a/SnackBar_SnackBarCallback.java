package crc642e1c7a98bdb5c44a;


public class SnackBar_SnackBarCallback
	extends com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismissed:(Ljava/lang/Object;I)V:GetOnDismissed_Ljava_lang_Object_IHandler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.UI.Views.SnackBar+SnackBarCallback, Xamarin.CommunityToolkit", SnackBar_SnackBarCallback.class, __md_methods);
	}


	public SnackBar_SnackBarCallback ()
	{
		super ();
		if (getClass () == SnackBar_SnackBarCallback.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.SnackBar+SnackBarCallback, Xamarin.CommunityToolkit", "", this, new java.lang.Object[] {  });
	}


	public void onDismissed (java.lang.Object p0, int p1)
	{
		n_onDismissed (p0, p1);
	}

	private native void n_onDismissed (java.lang.Object p0, int p1);

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
