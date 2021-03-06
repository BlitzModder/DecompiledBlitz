package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator<GetBuyFlowInitializationTokenResponse>
{
  static void zza(GetBuyFlowInitializationTokenResponse paramGetBuyFlowInitializationTokenResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGetBuyFlowInitializationTokenResponse.getVersionCode());
    zzb.zza(paramParcel, 2, paramGetBuyFlowInitializationTokenResponse.zzbkI, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetBuyFlowInitializationTokenResponse zzht(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        arrayOfByte = zza.zzs(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetBuyFlowInitializationTokenResponse(i, arrayOfByte);
  }
  
  public GetBuyFlowInitializationTokenResponse[] zzkN(int paramInt)
  {
    return new GetBuyFlowInitializationTokenResponse[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/wallet/firstparty/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */