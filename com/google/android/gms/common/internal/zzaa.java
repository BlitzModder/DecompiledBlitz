package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaa
  implements Parcelable.Creator<SignInButtonConfig>
{
  static void zza(SignInButtonConfig paramSignInButtonConfig, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramSignInButtonConfig.mVersionCode);
    zzb.zzc(paramParcel, 2, paramSignInButtonConfig.zzqL());
    zzb.zzc(paramParcel, 3, paramSignInButtonConfig.zzqM());
    zzb.zza(paramParcel, 4, paramSignInButtonConfig.zzqN(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInButtonConfig zzar(Parcel paramParcel)
  {
    int k = 0;
    int m = zza.zzau(paramParcel);
    Scope[] arrayOfScope = null;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzcc(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        i = zza.zzg(paramParcel, n);
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        arrayOfScope = (Scope[])zza.zzb(paramParcel, n, Scope.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new SignInButtonConfig(i, j, k, arrayOfScope);
  }
  
  public SignInButtonConfig[] zzca(int paramInt)
  {
    return new SignInButtonConfig[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/common/internal/zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */