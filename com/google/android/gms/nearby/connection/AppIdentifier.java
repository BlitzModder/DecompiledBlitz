package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class AppIdentifier
  implements SafeParcelable
{
  public static final Parcelable.Creator<AppIdentifier> CREATOR = new zza();
  private final int mVersionCode;
  private final String zzavb;
  
  AppIdentifier(int paramInt, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzavb = zzx.zzh(paramString, "Missing application identifier value");
  }
  
  public AppIdentifier(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getIdentifier()
  {
    return this.zzavb;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/nearby/connection/AppIdentifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */