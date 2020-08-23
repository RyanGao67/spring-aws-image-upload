package com.makemake.awsimageupload.bucket;

import com.amazonaws.services.s3.model.Bucket;

public enum BucketName {
    PROFILE_IMAGE("image-upload-20200822");
    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }
    public String getBucketName(){
        return bucketName;
    }
}


//How to use enum:
//public enum Level {
//    HIGH  (3),  //calls constructor with value 3
//    MEDIUM(2),  //calls constructor with value 2
//    LOW   (1)   //calls constructor with value 1
//    ; // semicolon needed when fields / methods follow
//
//
//    private final int levelCode;
//
//    Level(int levelCode) {
//        this.levelCode = levelCode;
//    }
//
//    public int getLevelCode() {
//        return this.levelCode;
//    }
//
//}
//    You call a Java enum method via a reference to one of the constant values. Here is Java enum method call example:
//
//        Level level = Level.HIGH;
//
//        System.out.println(level.getLevelCode());
//        This code would print out the value 3 which is the value of the levelCode field for the enum constant HIGH.
