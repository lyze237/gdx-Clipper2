package clipper2.core;

import java.util.ArrayList;
import java.util.List;

/**
 * PathsD represent one or more PathD structures. While a single path can
 * represent a simple polygon, multiple paths are usually required to define
 * complex polygons that contain one or more holes.
 */
@SuppressWarnings("serial")
public class PathsD extends ArrayList<PathD> {

	public PathsD() {
		super();
	}

	public PathsD(int n) {
		super(n);
	}

	public PathsD(List<PathD> paths) {
		super(paths);
	}

}
