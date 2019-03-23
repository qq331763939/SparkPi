package com

import scala.math.random
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Administrator on 2016/5/13.
  */
//alt+Enter自动引入缺失的包
object SparkPi {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi").setMaster("spark://192.168.159.150:7077")
//      .setJars(List("E:\\workIdea2018\\SparkPi\\out\\artifacts\\SparkPi_jar"))
    val spark = new SparkContext(conf)
//    val slices = if (args.length > 0) args(0).toInt else 2
//    val n = 100000 * slices
//    val count = spark.parallelize(1 to n, slices).map { i =>
//      val x = random * 2 - 1
//      val y = random * 2 - 1
//      if (x * x + y * y < 1) 1 else 0
//    }.reduce(_ + _)
//    println("Pi is roughly " + 4.0 * count / n)
    println("=========="+spark.appName);
    spark.stop()
  }
}