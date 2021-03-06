package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class zzaa
  implements Parcelable.Creator<StartBleScanRequest>
{
  static void zza(StartBleScanRequest paramStartBleScanRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramStartBleScanRequest.getDataTypes(), false);
    zzb.zzc(paramParcel, 1000, paramStartBleScanRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramStartBleScanRequest.zzuE(), false);
    zzb.zzc(paramParcel, 3, paramStartBleScanRequest.getTimeoutSecs());
    zzb.zza(paramParcel, 4, paramStartBleScanRequest.zzui(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public StartBleScanRequest zzdA(Parcel paramParcel)
  {
    int i = 0;
    IBinder localIBinder1 = null;
    int k = zza.zzau(paramParcel);
    IBinder localIBinder2 = null;
    ArrayList localArrayList = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzcc(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        localArrayList = zza.zzc(paramParcel, m, DataType.CREATOR);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localIBinder1 = zza.zzq(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new StartBleScanRequest(j, localArrayList, localIBinder2, i, localIBinder1);
  }
  
  public StartBleScanRequest[] zzfB(int paramInt)
  {
    return new StartBleScanRequest[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/fitness/request/zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */