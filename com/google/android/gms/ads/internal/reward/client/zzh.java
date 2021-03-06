package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator<RewardedVideoAdRequestParcel>
{
  static void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramRewardedVideoAdRequestParcel.versionCode);
    zzb.zza(paramParcel, 2, paramRewardedVideoAdRequestParcel.zzGq, paramInt, false);
    zzb.zza(paramParcel, 3, paramRewardedVideoAdRequestParcel.zzqP, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RewardedVideoAdRequestParcel[] zzM(int paramInt)
  {
    return new RewardedVideoAdRequestParcel[paramInt];
  }
  
  public RewardedVideoAdRequestParcel zzn(Parcel paramParcel)
  {
    String str = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    AdRequestParcel localAdRequestParcel = null;
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
        i = zza.zzg(paramParcel, k);
        continue;
        localAdRequestParcel = (AdRequestParcel)zza.zza(paramParcel, k, AdRequestParcel.CREATOR);
        continue;
        str = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new RewardedVideoAdRequestParcel(i, localAdRequestParcel, str);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/ads/internal/reward/client/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */