package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

public abstract interface CustomEventNative
  extends CustomEvent
{
  public abstract void requestNativeAd(Context paramContext, CustomEventNativeListener paramCustomEventNativeListener, String paramString, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle);
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/CustomEventNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */