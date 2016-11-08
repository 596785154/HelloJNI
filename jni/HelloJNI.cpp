#include <jni.h>
#include<string.h>
#include"com_example_hellojni_HelloJNI.h"

JNIEXPORT jstring JNICALL Java_com_example_hellojni_HelloJNI_sayHello
  (JNIEnv *env, jclass, jstring)
{
    jstring str = (env)->NewStringUTF("HelloWorld from JNI !");
    return str;
}

JNIEXPORT jint JNICALL Java_com_example_hellojni_HelloJNI_add
  (JNIEnv *env, jclass, jint, jint){
    return 1024;
}
