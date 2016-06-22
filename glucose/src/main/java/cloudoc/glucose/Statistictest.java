package cloudoc.glucose;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Statistictest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("????????")
   private java.lang.Integer fbgCount = 0;

   @org.kie.api.definition.type.Label("????????")
   private java.lang.Integer fbgNormalCount = 0;

   @org.kie.api.definition.type.Label("???????")
   private java.lang.Double fbgNormalPercentage = 0.0;

   @org.kie.api.definition.type.Label("??2????????")
   private java.lang.Integer twoHpgCount = 0;

   @org.kie.api.definition.type.Label("??2???????")
   private java.lang.Double twoHpgNormalPercentage = 0.0;

   @org.kie.api.definition.type.Label("??????<=3.9???")
   private java.lang.Integer hypoglycemiaCount = 0;

   @org.kie.api.definition.type.Label("??????>=16.7???")
   private java.lang.Integer hyperglycemiaCount = 0;

   @org.kie.api.definition.type.Label("?????????")
   private java.lang.Double averageFBG = 0.0;

   @org.kie.api.definition.type.Label("????????????")
   private java.lang.Double fbgStandardDeviation = 0.0;

   @org.kie.api.definition.type.Label("???????????")
   private java.lang.Double fbgVariance = 0.0;

   @org.kie.api.definition.type.Label("????????2???")
   private java.lang.Double averageTwoHpg = 0.0;

   @org.kie.api.definition.type.Label("????????2??????")
   private java.lang.Double twoHpgStandardDeviation = 0.0;

   @org.kie.api.definition.type.Label("????????2?????")
   private java.lang.Double twoHpgVariance = 0.0;

   @org.kie.api.definition.type.Label("??2????????")
   private java.lang.Integer twoHpgNormalCount = 0;

   private java.util.List<cloudoc.glucose.Conclusion> conclusions = new java.util.ArrayList<cloudoc.glucose.Conclusion>();

   public Statistictest()
   {
   }

   public java.lang.Integer getFbgCount()
   {
      return this.fbgCount;
   }

   public void setFbgCount(java.lang.Integer fbgCount)
   {
      this.fbgCount = fbgCount;
   }

   public java.lang.Integer getFbgNormalCount()
   {
      return this.fbgNormalCount;
   }

   public void setFbgNormalCount(java.lang.Integer fbgNormalCount)
   {
      this.fbgNormalCount = fbgNormalCount;
   }

   public java.lang.Double getFbgNormalPercentage()
   {
      return this.fbgNormalPercentage;
   }

   public void setFbgNormalPercentage(java.lang.Double fbgNormalPercentage)
   {
      this.fbgNormalPercentage = fbgNormalPercentage;
   }

   public java.lang.Integer getTwoHpgCount()
   {
      return this.twoHpgCount;
   }

   public void setTwoHpgCount(java.lang.Integer twoHpgCount)
   {
      this.twoHpgCount = twoHpgCount;
   }

   public java.lang.Double getTwoHpgNormalPercentage()
   {
      return this.twoHpgNormalPercentage;
   }

   public void setTwoHpgNormalPercentage(java.lang.Double twoHpgNormalPercentage)
   {
      this.twoHpgNormalPercentage = twoHpgNormalPercentage;
   }

   public java.lang.Integer getHypoglycemiaCount()
   {
      return this.hypoglycemiaCount;
   }

   public void setHypoglycemiaCount(java.lang.Integer hypoglycemiaCount)
   {
      this.hypoglycemiaCount = hypoglycemiaCount;
   }

   public java.lang.Integer getHyperglycemiaCount()
   {
      return this.hyperglycemiaCount;
   }

   public void setHyperglycemiaCount(java.lang.Integer hyperglycemiaCount)
   {
      this.hyperglycemiaCount = hyperglycemiaCount;
   }

   public java.lang.Double getAverageFBG()
   {
      return this.averageFBG;
   }

   public void setAverageFBG(java.lang.Double averageFBG)
   {
      this.averageFBG = averageFBG;
   }

   public java.lang.Double getFbgStandardDeviation()
   {
      return this.fbgStandardDeviation;
   }

   public void setFbgStandardDeviation(java.lang.Double fbgStandardDeviation)
   {
      this.fbgStandardDeviation = fbgStandardDeviation;
   }

   public java.lang.Double getFbgVariance()
   {
      return this.fbgVariance;
   }

   public void setFbgVariance(java.lang.Double fbgVariance)
   {
      this.fbgVariance = fbgVariance;
   }

   public java.lang.Double getAverageTwoHpg()
   {
      return this.averageTwoHpg;
   }

   public void setAverageTwoHpg(java.lang.Double averageTwoHpg)
   {
      this.averageTwoHpg = averageTwoHpg;
   }

   public java.lang.Double getTwoHpgStandardDeviation()
   {
      return this.twoHpgStandardDeviation;
   }

   public void setTwoHpgStandardDeviation(java.lang.Double twoHpgStandardDeviation)
   {
      this.twoHpgStandardDeviation = twoHpgStandardDeviation;
   }

   public java.lang.Double getTwoHpgVariance()
   {
      return this.twoHpgVariance;
   }

   public void setTwoHpgVariance(java.lang.Double twoHpgVariance)
   {
      this.twoHpgVariance = twoHpgVariance;
   }

   public java.lang.Integer getTwoHpgNormalCount()
   {
      return this.twoHpgNormalCount;
   }

   public void setTwoHpgNormalCount(java.lang.Integer twoHpgNormalCount)
   {
      this.twoHpgNormalCount = twoHpgNormalCount;
   }

   public java.util.List<cloudoc.glucose.Conclusion> getConclusions()
   {
      return this.conclusions;
   }

   public void setConclusions(
         java.util.List<cloudoc.glucose.Conclusion> conclusions)
   {
      this.conclusions = conclusions;
   }

   public void addConclusion(cloudoc.glucose.Conclusion c)
   {
      this.conclusions.add(c);
   }

   public void addConclusion(String title, String detail, String reason)
   {
      cloudoc.glucose.Conclusion c = new cloudoc.glucose.Conclusion(title, detail, reason);
      this.conclusions.add(c);
   }

   public Statistictest(java.lang.Integer fbgCount,
         java.lang.Integer fbgNormalCount, java.lang.Double fbgNormalPercentage,
         java.lang.Integer twoHpgCount, java.lang.Double twoHpgNormalPercentage,
         java.lang.Integer hypoglycemiaCount,
         java.lang.Integer hyperglycemiaCount, java.lang.Double averageFBG,
         java.lang.Double fbgStandardDeviation, java.lang.Double fbgVariance,
         java.lang.Double averageTwoHpg,
         java.lang.Double twoHpgStandardDeviation,
         java.lang.Double twoHpgVariance, java.lang.Integer twoHpgNormalCount,
         java.util.List<cloudoc.glucose.Conclusion> conclusions)
   {
      this.fbgCount = fbgCount;
      this.fbgNormalCount = fbgNormalCount;
      this.fbgNormalPercentage = fbgNormalPercentage;
      this.twoHpgCount = twoHpgCount;
      this.twoHpgNormalPercentage = twoHpgNormalPercentage;
      this.hypoglycemiaCount = hypoglycemiaCount;
      this.hyperglycemiaCount = hyperglycemiaCount;
      this.averageFBG = averageFBG;
      this.fbgStandardDeviation = fbgStandardDeviation;
      this.fbgVariance = fbgVariance;
      this.averageTwoHpg = averageTwoHpg;
      this.twoHpgStandardDeviation = twoHpgStandardDeviation;
      this.twoHpgVariance = twoHpgVariance;
      this.twoHpgNormalCount = twoHpgNormalCount;
      this.conclusions = conclusions;
   }

}