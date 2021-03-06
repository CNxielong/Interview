package com.javaee.collections.map;
/**
 * 
 * @Title: MapElement  
 * @Description: TODO(检测Hash冲突)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class MapElement {
	private int id;
	private String name;
	
	public MapElement() {
		super();
	}
	public MapElement(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	/**
	 * 
	 * @Title: hashCode  
	 * @Description: TODO(返回值都是1,用于测试Hash冲突)  
	 * @return   
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapElement other = (MapElement) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MapElement [id=" + id + ", name=" + name + "]";
	}

	
}
