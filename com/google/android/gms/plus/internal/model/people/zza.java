package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class zza
  implements Parcelable.Creator<PersonEntity>
{
  static void zza(PersonEntity paramPersonEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Set localSet = paramPersonEntity.zzaZA;
    if (localSet.contains(Integer.valueOf(1))) {
      zzb.zzc(paramParcel, 1, paramPersonEntity.mVersionCode);
    }
    if (localSet.contains(Integer.valueOf(2))) {
      zzb.zza(paramParcel, 2, paramPersonEntity.zzbay, true);
    }
    if (localSet.contains(Integer.valueOf(3))) {
      zzb.zza(paramParcel, 3, paramPersonEntity.zzbaz, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(4))) {
      zzb.zza(paramParcel, 4, paramPersonEntity.zzbaA, true);
    }
    if (localSet.contains(Integer.valueOf(5))) {
      zzb.zza(paramParcel, 5, paramPersonEntity.zzbaB, true);
    }
    if (localSet.contains(Integer.valueOf(6))) {
      zzb.zzc(paramParcel, 6, paramPersonEntity.zzbaC);
    }
    if (localSet.contains(Integer.valueOf(7))) {
      zzb.zza(paramParcel, 7, paramPersonEntity.zzbaD, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(8))) {
      zzb.zza(paramParcel, 8, paramPersonEntity.zzbaE, true);
    }
    if (localSet.contains(Integer.valueOf(9))) {
      zzb.zza(paramParcel, 9, paramPersonEntity.zzVu, true);
    }
    if (localSet.contains(Integer.valueOf(12))) {
      zzb.zzc(paramParcel, 12, paramPersonEntity.zztH);
    }
    if (localSet.contains(Integer.valueOf(14))) {
      zzb.zza(paramParcel, 14, paramPersonEntity.zzxX, true);
    }
    if (localSet.contains(Integer.valueOf(15))) {
      zzb.zza(paramParcel, 15, paramPersonEntity.zzbaF, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(16))) {
      zzb.zza(paramParcel, 16, paramPersonEntity.zzbaG);
    }
    if (localSet.contains(Integer.valueOf(19))) {
      zzb.zza(paramParcel, 19, paramPersonEntity.zzbaH, paramInt, true);
    }
    if (localSet.contains(Integer.valueOf(18))) {
      zzb.zza(paramParcel, 18, paramPersonEntity.zzZe, true);
    }
    if (localSet.contains(Integer.valueOf(21))) {
      zzb.zzc(paramParcel, 21, paramPersonEntity.zzbaJ);
    }
    if (localSet.contains(Integer.valueOf(20))) {
      zzb.zza(paramParcel, 20, paramPersonEntity.zzbaI, true);
    }
    if (localSet.contains(Integer.valueOf(23))) {
      zzb.zzc(paramParcel, 23, paramPersonEntity.zzbaL, true);
    }
    if (localSet.contains(Integer.valueOf(22))) {
      zzb.zzc(paramParcel, 22, paramPersonEntity.zzbaK, true);
    }
    if (localSet.contains(Integer.valueOf(25))) {
      zzb.zzc(paramParcel, 25, paramPersonEntity.zzbaN);
    }
    if (localSet.contains(Integer.valueOf(24))) {
      zzb.zzc(paramParcel, 24, paramPersonEntity.zzbaM);
    }
    if (localSet.contains(Integer.valueOf(27))) {
      zzb.zza(paramParcel, 27, paramPersonEntity.zzF, true);
    }
    if (localSet.contains(Integer.valueOf(26))) {
      zzb.zza(paramParcel, 26, paramPersonEntity.zzbaO, true);
    }
    if (localSet.contains(Integer.valueOf(29))) {
      zzb.zza(paramParcel, 29, paramPersonEntity.zzbaQ);
    }
    if (localSet.contains(Integer.valueOf(28))) {
      zzb.zzc(paramParcel, 28, paramPersonEntity.zzbaP, true);
    }
    zzb.zzI(paramParcel, i);
  }
  
  public PersonEntity zzgt(Parcel paramParcel)
  {
    int i2 = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    HashSet localHashSet = new HashSet();
    int i1 = 0;
    String str10 = null;
    PersonEntity.AgeRangeEntity localAgeRangeEntity = null;
    String str9 = null;
    String str8 = null;
    int n = 0;
    PersonEntity.CoverEntity localCoverEntity = null;
    String str7 = null;
    String str6 = null;
    int m = 0;
    String str5 = null;
    PersonEntity.ImageEntity localImageEntity = null;
    boolean bool2 = false;
    String str4 = null;
    PersonEntity.NameEntity localNameEntity = null;
    String str3 = null;
    int k = 0;
    ArrayList localArrayList3 = null;
    ArrayList localArrayList2 = null;
    int j = 0;
    int i = 0;
    String str2 = null;
    String str1 = null;
    ArrayList localArrayList1 = null;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < i2)
    {
      int i3 = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzcc(i3))
      {
      case 10: 
      case 11: 
      case 13: 
      case 17: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, i3);
        break;
      case 1: 
        i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2: 
        str10 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3: 
        localAgeRangeEntity = (PersonEntity.AgeRangeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i3, PersonEntity.AgeRangeEntity.CREATOR);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4: 
        str9 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5: 
        str8 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6: 
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7: 
        localCoverEntity = (PersonEntity.CoverEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i3, PersonEntity.CoverEntity.CREATOR);
        localHashSet.add(Integer.valueOf(7));
        break;
      case 8: 
        str7 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(8));
        break;
      case 9: 
        str6 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(9));
        break;
      case 12: 
        m = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(12));
        break;
      case 14: 
        str5 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(14));
        break;
      case 15: 
        localImageEntity = (PersonEntity.ImageEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i3, PersonEntity.ImageEntity.CREATOR);
        localHashSet.add(Integer.valueOf(15));
        break;
      case 16: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i3);
        localHashSet.add(Integer.valueOf(16));
        break;
      case 19: 
        localNameEntity = (PersonEntity.NameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, i3, PersonEntity.NameEntity.CREATOR);
        localHashSet.add(Integer.valueOf(19));
        break;
      case 18: 
        str4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(18));
        break;
      case 21: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(21));
        break;
      case 20: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(20));
        break;
      case 23: 
        localArrayList2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i3, PersonEntity.PlacesLivedEntity.CREATOR);
        localHashSet.add(Integer.valueOf(23));
        break;
      case 22: 
        localArrayList3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i3, PersonEntity.OrganizationsEntity.CREATOR);
        localHashSet.add(Integer.valueOf(22));
        break;
      case 25: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(25));
        break;
      case 24: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, i3);
        localHashSet.add(Integer.valueOf(24));
        break;
      case 27: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(27));
        break;
      case 26: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, i3);
        localHashSet.add(Integer.valueOf(26));
        break;
      case 29: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i3);
        localHashSet.add(Integer.valueOf(29));
        break;
      case 28: 
        localArrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, i3, PersonEntity.UrlsEntity.CREATOR);
        localHashSet.add(Integer.valueOf(28));
      }
    }
    if (paramParcel.dataPosition() != i2) {
      throw new zza.zza("Overread allowed size end=" + i2, paramParcel);
    }
    return new PersonEntity(localHashSet, i1, str10, localAgeRangeEntity, str9, str8, n, localCoverEntity, str7, str6, m, str5, localImageEntity, bool2, str4, localNameEntity, str3, k, localArrayList3, localArrayList2, j, i, str2, str1, localArrayList1, bool1);
  }
  
  public PersonEntity[] zzjw(int paramInt)
  {
    return new PersonEntity[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/plus/internal/model/people/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */