package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator<StartScanRequest>
{
  static void zza(StartScanRequest paramStartScanRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramStartScanRequest.zzCr(), false);
    zzb.zzc(paramParcel, 1000, paramStartScanRequest.versionCode);
    zzb.zza(paramParcel, 2, paramStartScanRequest.zzui(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public StartScanRequest zzfN(Parcel paramParcel)
  {
    IBinder localIBinder2 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    IBinder localIBinder1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder2 = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new StartScanRequest(i, localIBinder1, localIBinder2);
  }
  
  public StartScanRequest[] zziG(int paramInt)
  {
    return new StartScanRequest[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/nearby/bootstrap/request/zzg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */