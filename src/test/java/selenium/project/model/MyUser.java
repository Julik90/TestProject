package selenium.project.model;

import java.util.Objects;

public class MyUser{
	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private int id;
	private String email;
	private String username;

	public String getWebsite(){
		return website;
	}

	public Address getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public Company getCompany(){
		return company;
	}

	public int getId(){
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyUser myUser = (MyUser) o;
		return id == myUser.id &&
				Objects.equals(website, myUser.website) &&
				Objects.equals(address, myUser.address) &&
				Objects.equals(phone, myUser.phone) &&
				Objects.equals(name, myUser.name) &&
				Objects.equals(company, myUser.company) &&
				Objects.equals(email, myUser.email) &&
				Objects.equals(username, myUser.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(website, address, phone, name, company, id, email, username);
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}
}
