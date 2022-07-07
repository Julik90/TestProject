package selenium.project.model;

import java.util.Objects;

public class Geo{
	private String lng;
	private String lat;

	public String getLng(){
		return lng;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Geo geo = (Geo) o;
		return Objects.equals(lng, geo.lng) &&
				Objects.equals(lat, geo.lat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lng, lat);
	}

	public String getLat(){
		return lat;
	}
}
