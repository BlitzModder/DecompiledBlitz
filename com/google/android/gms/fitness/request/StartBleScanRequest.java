package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzpp;
import com.google.android.gms.internal.zzpp.zza;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<StartBleScanRequest> CREATOR = new zzaa();
  private final int mVersionCode;
  private final List<DataType> zzatZ;
  private final zzpp zzayj;
  private final zzn zzazg;
  private final int zzazh;
  
  StartBleScanRequest(int paramInt1, List<DataType> paramList, IBinder paramIBinder1, int paramInt2, IBinder paramIBinder2)
  {
    this.mVersionCode = paramInt1;
    this.zzatZ = paramList;
    this.zzazg = zzn.zza.zzbU(paramIBinder1);
    this.zzazh = paramInt2;
    this.zzayj = zzpp.zza.zzbR(paramIBinder2);
  }
  
  private StartBleScanRequest(Builder paramBuilder)
  {
    this(zznh.zzb(Builder.zza(paramBuilder)), Builder.zzb(paramBuilder), Builder.zzc(paramBuilder), null);
  }
  
  public StartBleScanRequest(StartBleScanRequest paramStartBleScanRequest, zzpp paramzzpp)
  {
    this(paramStartBleScanRequest.zzatZ, paramStartBleScanRequest.zzazg, paramStartBleScanRequest.zzazh, paramzzpp);
  }
  
  public StartBleScanRequest(List<DataType> paramList, zzn paramzzn, int paramInt, zzpp paramzzpp)
  {
    this.mVersionCode = 4;
    this.zzatZ = paramList;
    this.zzazg = paramzzn;
    this.zzazh = paramInt;
    this.zzayj = paramzzpp;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List<DataType> getDataTypes()
  {
    return Collections.unmodifiableList(this.zzatZ);
  }
  
  public int getTimeoutSecs()
  {
    return this.zzazh;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    return zzw.zzx(this).zzg("dataTypes", this.zzatZ).zzg("timeoutSecs", Integer.valueOf(this.zzazh)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzuE()
  {
    return this.zzazg.asBinder();
  }
  
  public IBinder zzui()
  {
    if (this.zzayj == null) {
      return null;
    }
    return this.zzayj.asBinder();
  }
  
  public static class Builder
  {
    private DataType[] zzayE = new DataType[0];
    private zzn zzazg;
    private int zzazh = 10;
    
    public StartBleScanRequest build()
    {
      if (this.zzazg != null) {}
      for (boolean bool = true;; bool = false)
      {
        zzx.zza(bool, "Must set BleScanCallback");
        return new StartBleScanRequest(this, null);
      }
    }
    
    public Builder setBleScanCallback(BleScanCallback paramBleScanCallback)
    {
      zza(zza.zza.zzug().zza(paramBleScanCallback));
      return this;
    }
    
    public Builder setDataTypes(DataType... paramVarArgs)
    {
      this.zzayE = paramVarArgs;
      return this;
    }
    
    public Builder setTimeoutSecs(int paramInt)
    {
      boolean bool2 = true;
      if (paramInt > 0)
      {
        bool1 = true;
        zzx.zzb(bool1, "Stop time must be greater than zero");
        if (paramInt > 60) {
          break label40;
        }
      }
      label40:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        zzx.zzb(bool1, "Stop time must be less than 1 minute");
        this.zzazh = paramInt;
        return this;
        bool1 = false;
        break;
      }
    }
    
    public Builder zza(zzn paramzzn)
    {
      this.zzazg = paramzzn;
      return this;
    }
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/fitness/request/StartBleScanRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */