# Gradle-Explore
通过命令行指定library的buildType   
参考: [如何让library的buildType类型跟app的buildType类型一致 ??](http://www.jianshu.com/p/3751f95a6480)



---

注意: 
打release包时, 用的keystone需要换成你自己的keystore
具体步骤: 
1. 在app和app-linkage目录下添加你自己的keystore文件
2. 在项目根目录下添加gradle.properties文件, 并在其中添加下面语句: 
```
alias=你的keystore的keyAlias
kpwd=你的keystore的keyPassword
spwd=你的keystore的storePassword
```
3. 在主module (app/app-linkage) 的build.gradle文件中配置release包所需要的签名信息, 如下: 
```
android {
    //其他配置省略...
    
    //1. 配置签名信息
    signingConfigs {
        release {
            storeFile file("你的keystore文件的文件名称") //如: stone.keystore
            keyAlias "$alias"
            keyPassword "$kpwd"
            storePassword "$spwd"
        }
    }
    
    buildTypes {
        release {
            //2. 使用签名
            signingConfig signingConfigs.release
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}
```