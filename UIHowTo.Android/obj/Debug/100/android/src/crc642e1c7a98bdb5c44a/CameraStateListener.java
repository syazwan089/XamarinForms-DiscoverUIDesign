package crc642e1c7a98bdb5c44a;


public class CameraStateListener
	extends android.hardware.camera2.CameraDevice.StateCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOpened:(Landroid/hardware/camera2/CameraDevice;)V:GetOnOpened_Landroid_hardware_camera2_CameraDevice_Handler\n" +
			"n_onDisconnected:(Landroid/hardware/camera2/CameraDevice;)V:GetOnDisconnected_Landroid_hardware_camera2_CameraDevice_Handler\n" +
			"n_onError:(Landroid/hardware/camera2/CameraDevice;I)V:GetOnError_Landroid_hardware_camera2_CameraDevice_IHandler\n" +
			"n_onClosed:(Landroid/hardware/camera2/CameraDevice;)V:GetOnClosed_Landroid_hardware_camera2_CameraDevice_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.CommunityToolkit.UI.Views.CameraStateListener, Xamarin.CommunityToolkit", CameraStateListener.class, __md_methods);
	}


	public CameraStateListener ()
	{
		super ();
		if (getClass () == CameraStateListener.class)
			mono.android.TypeManager.Activate ("Xamarin.CommunityToolkit.UI.Views.CameraStateListener, Xamarin.CommunityToolkit", "", this, new java.lang.Object[] {  });
	}


	public void onOpened (android.hardware.camera2.CameraDevice p0)
	{
		n_onOpened (p0);
	}

	private native void n_onOpened (android.hardware.camera2.CameraDevice p0);


	public void onDisconnected (android.hardware.camera2.CameraDevice p0)
	{
		n_onDisconnected (p0);
	}

	private native void n_onDisconnected (android.hardware.camera2.CameraDevice p0);


	public void onError (android.hardware.camera2.CameraDevice p0, int p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (android.hardware.camera2.CameraDevice p0, int p1);


	public void onClosed (android.hardware.camera2.CameraDevice p0)
	{
		n_onClosed (p0);
	}

	private native void n_onClosed (android.hardware.camera2.CameraDevice p0);

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
