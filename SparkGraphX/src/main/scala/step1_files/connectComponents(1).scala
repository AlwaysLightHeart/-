import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.graphx._

object connectComponents{
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("connectComponents ").setMaster("local[4]")
    val sc = new SparkContext(conf) //屏蔽日志
    Logger.getLogger("org.apache.spark").setLevel(Level.WARN)
    Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.OFF)
    //**************Begin*************************
    //构造VertexRDD

    //构造EdgeRDD

    //构造图Graph[VD,ED]

    //计算连通分量

    println("")
    //输出结果

  }
}

