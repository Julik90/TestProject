package selenium.project.model;

import java.util.Objects;

public class Address{
	private String zipcode;
	private Geo geo;
	private String suite;
	private String city;
	private String street;

	public String getZipcode(){
		return zipcode;
	}

	public Geo getGeo(){
		return geo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Address address = (Address) o;
		return Objects.equals(zipcode, address.zipcode) &&
				Objects.equals(geo, address.geo) &&
				Objects.equals(suite, address.suite) &&
				Objects.equals(city, address.city) &&
				Objects.equals(street, address.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zipcode, geo, suite, city, street);
	}

	public String getSuite(){
		return suite;
	}

	public String getCity(){
		return city;
	}

	public String getStreet(){
		return street;
	}
}
