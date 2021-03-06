package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zza
  implements Parcelable.Creator<FitnessSensorServiceRequest>
{
  static void zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramFitnessSensorServiceRequest.getDataSource(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramFitnessSensorServiceRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramFitnessSensorServiceRequest.zzuz(), false);
    zzb.zza(paramParcel, 3, paramFitnessSensorServiceRequest.zztU());
    zzb.zza(paramParcel, 4, paramFitnessSensorServiceRequest.zzuQ());
    zzb.zzI(paramParcel, i);
  }
  
  public FitnessSensorServiceRequest zzdR(Parcel paramParcel)
  {
    long l1 = 0L;
    IBinder localIBinder = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int i = 0;
    long l2 = 0L;
    DataSource localDataSource = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzcc(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        localDataSource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, DataSource.CREATOR);
        break;
      case 1000: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 3: 
        l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
        break;
      case 4: 
        l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new FitnessSensorServiceRequest(i, localDataSource, localIBinder, l2, l1);
  }
  
  public FitnessSensorServiceRequest[] zzfS(int paramInt)
  {
    return new FitnessSensorServiceRequest[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/fitness/service/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */