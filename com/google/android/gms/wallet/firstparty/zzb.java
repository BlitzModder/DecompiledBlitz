package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator<GetBuyFlowInitializationTokenRequest>
{
  static void zza(GetBuyFlowInitializationTokenRequest paramGetBuyFlowInitializationTokenRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, paramGetBuyFlowInitializationTokenRequest.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramGetBuyFlowInitializationTokenRequest.zzbkG, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, paramGetBuyFlowInitializationTokenRequest.zzbkH, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public GetBuyFlowInitializationTokenRequest zzhs(Parcel paramParcel)
  {
    byte[] arrayOfByte2 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    byte[] arrayOfByte1 = null;
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
        arrayOfByte1 = zza.zzs(paramParcel, k);
        break;
      case 3: 
        arrayOfByte2 = zza.zzs(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetBuyFlowInitializationTokenRequest(i, arrayOfByte1, arrayOfByte2);
  }
  
  public GetBuyFlowInitializationTokenRequest[] zzkM(int paramInt)
  {
    return new GetBuyFlowInitializationTokenRequest[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/wallet/firstparty/zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */