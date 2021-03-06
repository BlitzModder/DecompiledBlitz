package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zznm;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DataType
  implements SafeParcelable
{
  public static final DataType AGGREGATE_ACTIVITY_SUMMARY;
  public static final DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
  public static final DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
  @Deprecated
  public static final DataType AGGREGATE_CALORIES_CONSUMED;
  public static final DataType AGGREGATE_CALORIES_EXPENDED;
  public static final DataType AGGREGATE_DISTANCE_DELTA;
  public static final DataType AGGREGATE_HEART_RATE_SUMMARY;
  public static final Set<DataType> AGGREGATE_INPUT_TYPES;
  public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX;
  public static final DataType AGGREGATE_NUTRITION_SUMMARY;
  public static final DataType AGGREGATE_POWER_SUMMARY;
  public static final DataType AGGREGATE_SPEED_SUMMARY;
  public static final DataType AGGREGATE_STEP_COUNT_DELTA;
  public static final DataType AGGREGATE_WEIGHT_SUMMARY;
  public static final Parcelable.Creator<DataType> CREATOR = new zzg();
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
  public static final DataType TYPE_ACTIVITY_SAMPLE;
  public static final DataType TYPE_ACTIVITY_SEGMENT;
  public static final DataType TYPE_BASAL_METABOLIC_RATE;
  public static final DataType TYPE_BODY_FAT_PERCENTAGE;
  public static final DataType TYPE_CALORIES_CONSUMED;
  public static final DataType TYPE_CALORIES_EXPENDED;
  public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
  public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
  public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
  public static final DataType TYPE_CYCLING_WHEEL_RPM;
  public static final DataType TYPE_DISTANCE_CUMULATIVE;
  public static final DataType TYPE_DISTANCE_DELTA;
  public static final DataType TYPE_HEART_RATE_BPM;
  public static final DataType TYPE_HEIGHT;
  public static final DataType TYPE_LOCATION_SAMPLE;
  public static final DataType TYPE_LOCATION_TRACK;
  public static final DataType TYPE_NUTRITION;
  public static final DataType TYPE_POWER_SAMPLE;
  public static final DataType TYPE_SPEED;
  public static final DataType TYPE_STEP_COUNT_CADENCE;
  public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
  public static final DataType TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", new Field[] { Field.FIELD_STEPS });
  public static final DataType TYPE_WEIGHT;
  public static final DataType TYPE_WORKOUT_EXERCISE;
  public static final DataType zzauq;
  public static final DataType zzaur;
  public static final DataType zzaus;
  public static final DataType zzaut;
  public static final DataType zzauu;
  public static final DataType zzauv;
  public static final DataType zzauw;
  private static final Map<DataType, List<DataType>> zzaux;
  public static final DataType[] zzauy;
  private final String mName;
  private final int mVersionCode;
  private final List<Field> zzauz;
  
  static
  {
    TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", new Field[] { Field.FIELD_STEPS });
    TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", new Field[] { Field.FIELD_RPM });
    TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", new Field[] { Field.FIELD_ACTIVITY });
    zzauq = new DataType("com.google.floor_change", new Field[] { Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE, Field.zzauI, Field.zzauL });
    TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", new Field[] { Field.FIELD_CALORIES });
    TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", new Field[] { Field.FIELD_CALORIES });
    TYPE_BASAL_METABOLIC_RATE = new DataType("com.google.calories.bmr", new Field[] { Field.FIELD_CALORIES });
    TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", new Field[] { Field.FIELD_WATTS });
    TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", new Field[] { Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE });
    zzaur = new DataType("com.google.accelerometer", new Field[] { Field.zzauO, Field.zzauP, Field.zzauQ });
    TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", new Field[] { Field.FIELD_BPM });
    TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", new Field[] { Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE });
    TYPE_LOCATION_TRACK = new DataType("com.google.location.track", new Field[] { Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE });
    TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", new Field[] { Field.FIELD_DISTANCE });
    TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", new Field[] { Field.FIELD_DISTANCE });
    TYPE_SPEED = new DataType("com.google.speed", new Field[] { Field.FIELD_SPEED });
    TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", new Field[] { Field.FIELD_REVOLUTIONS });
    TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", new Field[] { Field.FIELD_RPM });
    TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", new Field[] { Field.FIELD_REVOLUTIONS });
    TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", new Field[] { Field.FIELD_RPM });
    TYPE_HEIGHT = new DataType("com.google.height", new Field[] { Field.FIELD_HEIGHT });
    TYPE_WEIGHT = new DataType("com.google.weight", new Field[] { Field.FIELD_WEIGHT });
    TYPE_BODY_FAT_PERCENTAGE = new DataType("com.google.body.fat.percentage", new Field[] { Field.FIELD_PERCENTAGE });
    zzaus = new DataType("com.google.body.waist.circumference", new Field[] { Field.FIELD_CIRCUMFERENCE });
    zzaut = new DataType("com.google.body.hip.circumference", new Field[] { Field.FIELD_CIRCUMFERENCE });
    TYPE_NUTRITION = new DataType("com.google.nutrition", new Field[] { Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE, Field.FIELD_FOOD_ITEM });
    TYPE_WORKOUT_EXERCISE = new DataType("com.google.activity.exercise", new Field[] { Field.FIELD_EXERCISE, Field.FIELD_REPETITIONS, Field.FIELD_DURATION, Field.FIELD_RESISTANCE_TYPE, Field.FIELD_RESISTANCE });
    AGGREGATE_INPUT_TYPES = zznm.zzc(new DataType[] { TYPE_STEP_COUNT_DELTA, TYPE_DISTANCE_DELTA, TYPE_ACTIVITY_SEGMENT, zzauq, TYPE_SPEED, TYPE_HEART_RATE_BPM, TYPE_WEIGHT, TYPE_LOCATION_SAMPLE, TYPE_CALORIES_CONSUMED, TYPE_CALORIES_EXPENDED, TYPE_BODY_FAT_PERCENTAGE, zzaut, zzaus, TYPE_NUTRITION });
    AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", new Field[] { Field.FIELD_ACTIVITY, Field.FIELD_DURATION, Field.FIELD_NUM_SEGMENTS });
    zzauu = new DataType("com.google.floor_change.summary", new Field[] { Field.zzauG, Field.zzauH, Field.zzauJ, Field.zzauK, Field.zzauM, Field.zzauN });
    AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = new DataType("com.google.calories.bmr.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
    AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
    AGGREGATE_CALORIES_CONSUMED = TYPE_CALORIES_CONSUMED;
    AGGREGATE_CALORIES_EXPENDED = TYPE_CALORIES_EXPENDED;
    AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", new Field[] { Field.FIELD_LOW_LATITUDE, Field.FIELD_LOW_LONGITUDE, Field.FIELD_HIGH_LATITUDE, Field.FIELD_HIGH_LONGITUDE });
    AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = new DataType("com.google.body.fat.percentage.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    zzauv = new DataType("com.google.body.hip.circumference.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    zzauw = new DataType("com.google.body.waist.circumference.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", new Field[] { Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN });
    AGGREGATE_NUTRITION_SUMMARY = new DataType("com.google.nutrition.summary", new Field[] { Field.FIELD_NUTRIENTS, Field.FIELD_MEAL_TYPE });
    zzaux = new HashMap();
    zzaux.put(TYPE_ACTIVITY_SEGMENT, Collections.singletonList(AGGREGATE_ACTIVITY_SUMMARY));
    zzaux.put(TYPE_BASAL_METABOLIC_RATE, Collections.singletonList(AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY));
    zzaux.put(TYPE_BODY_FAT_PERCENTAGE, Collections.singletonList(AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY));
    zzaux.put(zzaut, Collections.singletonList(zzauv));
    zzaux.put(zzaus, Collections.singletonList(zzauw));
    zzaux.put(TYPE_CALORIES_CONSUMED, Collections.singletonList(AGGREGATE_CALORIES_CONSUMED));
    zzaux.put(TYPE_CALORIES_EXPENDED, Collections.singletonList(AGGREGATE_CALORIES_EXPENDED));
    zzaux.put(TYPE_DISTANCE_DELTA, Collections.singletonList(AGGREGATE_DISTANCE_DELTA));
    zzaux.put(zzauq, Collections.singletonList(zzauu));
    zzaux.put(TYPE_LOCATION_SAMPLE, Collections.singletonList(AGGREGATE_LOCATION_BOUNDING_BOX));
    zzaux.put(TYPE_NUTRITION, Collections.singletonList(AGGREGATE_NUTRITION_SUMMARY));
    zzaux.put(TYPE_POWER_SAMPLE, Collections.singletonList(AGGREGATE_POWER_SUMMARY));
    zzaux.put(TYPE_HEART_RATE_BPM, Collections.singletonList(AGGREGATE_HEART_RATE_SUMMARY));
    zzaux.put(TYPE_SPEED, Collections.singletonList(AGGREGATE_SPEED_SUMMARY));
    zzaux.put(TYPE_STEP_COUNT_DELTA, Collections.singletonList(AGGREGATE_STEP_COUNT_DELTA));
    zzaux.put(TYPE_WEIGHT, Collections.singletonList(AGGREGATE_WEIGHT_SUMMARY));
    zzauy = new DataType[] { zzaur, TYPE_WORKOUT_EXERCISE, TYPE_ACTIVITY_SAMPLE, TYPE_ACTIVITY_SEGMENT, AGGREGATE_ACTIVITY_SUMMARY, TYPE_BODY_FAT_PERCENTAGE, AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY, zzaut, zzauv, zzaus, zzauw, TYPE_BASAL_METABOLIC_RATE, AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY, TYPE_CALORIES_CONSUMED, TYPE_CALORIES_EXPENDED, TYPE_CYCLING_PEDALING_CADENCE, TYPE_CYCLING_PEDALING_CUMULATIVE, TYPE_CYCLING_WHEEL_REVOLUTION, TYPE_CYCLING_WHEEL_RPM, TYPE_DISTANCE_CUMULATIVE, TYPE_DISTANCE_DELTA, zzauq, zzauu, TYPE_HEART_RATE_BPM, AGGREGATE_HEART_RATE_SUMMARY, TYPE_HEIGHT, AGGREGATE_LOCATION_BOUNDING_BOX, TYPE_LOCATION_SAMPLE, TYPE_LOCATION_TRACK, TYPE_NUTRITION, AGGREGATE_NUTRITION_SUMMARY, TYPE_POWER_SAMPLE, AGGREGATE_POWER_SUMMARY, TYPE_SPEED, AGGREGATE_SPEED_SUMMARY, TYPE_STEP_COUNT_CADENCE, TYPE_STEP_COUNT_CUMULATIVE, TYPE_STEP_COUNT_DELTA, TYPE_WEIGHT, AGGREGATE_WEIGHT_SUMMARY };
  }
  
  DataType(int paramInt, String paramString, List<Field> paramList)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString;
    this.zzauz = Collections.unmodifiableList(paramList);
  }
  
  public DataType(String paramString, Field... paramVarArgs)
  {
    this(1, paramString, zznh.zzb(paramVarArgs));
  }
  
  public static List<DataType> getAggregatesForInput(DataType paramDataType)
  {
    paramDataType = (List)zzaux.get(paramDataType);
    if (paramDataType == null) {
      return Collections.emptyList();
    }
    return Collections.unmodifiableList(paramDataType);
  }
  
  public static String getMimeType(DataType paramDataType)
  {
    return "vnd.google.fitness.data_type/" + paramDataType.getName();
  }
  
  private boolean zza(DataType paramDataType)
  {
    return (this.mName.equals(paramDataType.mName)) && (this.zzauz.equals(paramDataType.zzauz));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataType)) && (zza((DataType)paramObject)));
  }
  
  public List<Field> getFields()
  {
    return this.zzauz;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return this.mName.hashCode();
  }
  
  public int indexOf(Field paramField)
  {
    int i = this.zzauz.indexOf(paramField);
    if (i < 0) {
      throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[] { paramField, this }));
    }
    return i;
  }
  
  public String toString()
  {
    return String.format("DataType{%s%s}", new Object[] { this.mName, this.zzauz });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public String zztM()
  {
    if (this.mName.startsWith("com.google.")) {
      return this.mName.substring(11);
    }
    return this.mName;
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/fitness/data/DataType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */