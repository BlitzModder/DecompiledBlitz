package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbd
  implements Parcelable.Creator<OnListEntriesResponse>
{
  static void zza(OnListEntriesResponse paramOnListEntriesResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramOnListEntriesResponse.mVersionCode);
    zzb.zza(paramParcel, 2, paramOnListEntriesResponse.zzaqp, paramInt, false);
    zzb.zza(paramParcel, 3, paramOnListEntriesResponse.zzaoG);
    zzb.zzI(paramParcel, i);
  }
  
  public OnListEntriesResponse zzbD(Parcel paramParcel)
  {
    boolean bool = false;
    int j = zza.zzau(paramParcel);
    DataHolder localDataHolder = null;
    int i = 0;
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
        localDataHolder = (DataHolder)zza.zza(paramParcel, k, DataHolder.CREATOR);
        continue;
        bool = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new OnListEntriesResponse(i, localDataHolder, bool);
  }
  
  public OnListEntriesResponse[] zzdy(int paramInt)
  {
    return new OnListEntriesResponse[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/internal/zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */