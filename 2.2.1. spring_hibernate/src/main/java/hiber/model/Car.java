package hiber.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private int serios;

	public Car() {
	}

	public Car(String model, int series) {
		this.model = model;
		this.serios = series;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSerios(int serios) {
		this.serios = serios;
	}

	public Long getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public int getSerios() {
		return serios;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", serios=" + serios
				+ "]";
	}
}
