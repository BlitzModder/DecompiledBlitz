package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FusedLocationProviderResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new zze();
  public static final FusedLocationProviderResult zzaLO = new FusedLocationProviderResult(Status.zzaeX);
  private final int mVersionCode;
  private final Status zzTA;
  
  FusedLocationProviderResult(int paramInt, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    this.zzTA = paramStatus;
  }
  
  public FusedLocationProviderResult(Status paramStatus)
  {
    this(1, paramStatus);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return this.zzTA;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/location/internal/FusedLocationProviderResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */