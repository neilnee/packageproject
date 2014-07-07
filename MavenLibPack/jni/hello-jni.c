#include <string.h>
#include <jni.h>

jstring
Java_com_neil_mavenlibpack_NativeLib_stringFromJNI( JNIEnv* env,
                                                  jobject thiz )
{
    return (*env)->NewStringUTF(env, "Hello from JNI! HeHe");
}
