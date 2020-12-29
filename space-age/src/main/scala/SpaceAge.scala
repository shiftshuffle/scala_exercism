object SpaceAge  {
  val earth_seconds = 31557600;

  val year_rotation = Map(
    "earth" -> 1.0,
    "mercury" -> 0.2408467,
    "venus" -> 0.61519726,
    "mars" -> 1.8808158,
    "jupiter" -> 11.862615,
    "saturn" -> 29.447498,
    "uranus" -> 84.016846,
    "neptune" -> 164.79132
  )


  def onEarth(seconds: Double): Double = {
     (seconds / earth_seconds) / year_rotation("earth")
  }

  def onMercury(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("mercury")
  }

  def onVenus(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("venus")
  }

  def onMars(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("mars")
  }

  def onJupiter(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("jupiter")
  }

  def onSaturn(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("saturn")
  }

  def onUranus(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("uranus")
  }

  def onNeptune(seconds: Double): Double = {
    (seconds / earth_seconds) / year_rotation("neptune")
  }

}