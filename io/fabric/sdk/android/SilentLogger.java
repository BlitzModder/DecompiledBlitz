package io.fabric.sdk.android;

public class SilentLogger
  implements Logger
{
  private int logLevel = 7;
  
  public void d(String paramString1, String paramString2) {}
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public void e(String paramString1, String paramString2) {}
  
  public void e(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public int getLogLevel()
  {
    return this.logLevel;
  }
  
  public void i(String paramString1, String paramString2) {}
  
  public void i(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public boolean isLoggable(String paramString, int paramInt)
  {
    return false;
  }
  
  public void log(int paramInt, String paramString1, String paramString2) {}
  
  public void log(int paramInt, String paramString1, String paramString2, boolean paramBoolean) {}
  
  public void setLogLevel(int paramInt) {}
  
  public void v(String paramString1, String paramString2) {}
  
  public void v(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public void w(String paramString1, String paramString2) {}
  
  public void w(String paramString1, String paramString2, Throwable paramThrowable) {}
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/SilentLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */