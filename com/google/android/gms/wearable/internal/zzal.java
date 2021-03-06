package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzal
  implements Parcelable.Creator<GetChannelOutputStreamResponse>
{
  static void zza(GetChannelOutputStreamResponse paramGetChannelOutputStreamResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGetChannelOutputStreamResponse.versionCode);
    zzb.zzc(paramParcel, 2, paramGetChannelOutputStreamResponse.statusCode);
    zzb.zza(paramParcel, 3, paramGetChannelOutputStreamResponse.zzbny, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetChannelOutputStreamResponse zzid(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzcc(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        j = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localParcelFileDescriptor = (ParcelFileDescriptor)zza.zza(paramParcel, m, ParcelFileDescriptor.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new GetChannelOutputStreamResponse(i, j, localParcelFileDescriptor);
  }
  
  public GetChannelOutputStreamResponse[] zzlE(int paramInt)
  {
    return new GetChannelOutputStreamResponse[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/wearable/internal/zzal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */