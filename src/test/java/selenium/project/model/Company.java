package selenium.project.model;

import java.util.Objects;

public class Company{
	private String bs;
	private String catchPhrase;
	private String name;

	public String getBs(){
		return bs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Company company = (Company) o;
		return Objects.equals(bs, company.bs) &&
				Objects.equals(catchPhrase, company.catchPhrase) &&
				Objects.equals(name, company.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bs, catchPhrase, name);
	}

	public String getCatchPhrase(){
		return catchPhrase;
	}

	public String getName(){
		return name;
	}
}
