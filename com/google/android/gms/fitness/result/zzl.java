package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator<SyncInfoResult>
{
  static void zza(SyncInfoResult paramSyncInfoResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSyncInfoResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSyncInfoResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramSyncInfoResult.zzuO());
    zzb.zzI(paramParcel, i);
  }
  
  public SyncInfoResult zzdQ(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    Status localStatus = null;
    long l = 0L;
    if (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
      }
      for (;;)
      {
        break;
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        continue;
        i = zza.zzg(paramParcel, k);
        continue;
        l = zza.zzi(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SyncInfoResult(i, localStatus, l);
  }
  
  public SyncInfoResult[] zzfR(int paramInt)
  {
    return new SyncInfoResult[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/fitness/result/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */