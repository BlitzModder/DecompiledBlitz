package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class TextModuleData
  implements SafeParcelable
{
  public static final Parcelable.Creator<TextModuleData> CREATOR = new zzf();
  String body;
  private final int mVersionCode;
  String zzblF;
  
  TextModuleData()
  {
    this.mVersionCode = 1;
  }
  
  TextModuleData(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzblF = paramString1;
    this.body = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/wallet/wobs/TextModuleData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */