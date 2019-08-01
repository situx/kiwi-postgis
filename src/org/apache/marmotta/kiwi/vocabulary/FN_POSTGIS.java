package org.apache.marmotta.kiwi.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.Namespace;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.NamespaceImpl;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * Implement geof Function from GeoSPARQL standard
 *
 *
 * @author Xavier Sumba (xavier.sumba93@ucuenca.ec)
 */
public class FN_POSTGIS {

	public static final String NAMESPACE="http://www.opengis.net/ont/geosparql#";
	
	public static final	ValueFactory factory = new ValueFactoryImpl();
	public static final	URI ST_DWITHIN3D=factory.createURI(NAMESPACE, "ST_3DDWithin");
	public static final	URI ST_CLOSESTPOINT3D=factory.createURI(NAMESPACE, "ST_ClosestPoint3D");
	public static final	URI ST_LONGESTLINE3D=factory.createURI(NAMESPACE, "ST_LongestLine3D");
	public static final	URI ST_MAXDISTANCE3D=factory.createURI(NAMESPACE, "ST_MaxDistance3D");
	public static final	URI ST_SHORTESTLINE3D=factory.createURI(NAMESPACE, "ST_ShortestLine3D");
	public static final	URI ST_ACCUM=factory.createURI(NAMESPACE, "ST_Accum");
	public static final	URI ST_ADDBAND=factory.createURI(NAMESPACE, "ST_AddBand");
	public static final	URI ST_ADDPOINT=factory.createURI(NAMESPACE, "ST_AddPoint");
	public static final	URI ST_ADDZ=factory.createURI(NAMESPACE, "ST_AddZ");
	public static final	URI ST_ASBINARY=factory.createURI(NAMESPACE, "ST_AsBinary");
	public static final	URI ST_ASENCODEDPOLYLINE=factory.createURI(NAMESPACE, "ST_AsEncodedPolyline");
	public static final	URI ST_ASHEXEWKB=factory.createURI(NAMESPACE, "ST_AsHEXEWKB");
	public static final	URI ST_ASKML=factory.createURI(NAMESPACE, "ST_AsKML");
	public static final	URI ST_ASGML=factory.createURI(NAMESPACE, "ST_AsGML");
	public static final	URI ST_ASGEOHASH=factory.createURI(NAMESPACE, "ST_AsGeoHash");
	public static final	URI ST_ASGEOURI=factory.createURI(NAMESPACE, "ST_AsGeoURI");
	public static final	URI ST_ASGEOBUF=factory.createURI(NAMESPACE, "ST_AsGeoBuf");
	public static final	URI ST_ASGEOJSON=factory.createURI(NAMESPACE, "ST_AsGeoJSON");
	public static final	URI ST_ASGEOJSONLD=factory.createURI(NAMESPACE, "ST_AsGeoJSONLD");
	public static final	URI ST_ASGEORSS=factory.createURI(NAMESPACE, "ST_AsGeoRSS");
	public static final	URI ST_ASGPX=factory.createURI(NAMESPACE, "ST_AsGPX");
	public static final	URI ST_ASPOLYSHAPE=factory.createURI(NAMESPACE, "ST_AsPolyshape");
	public static final	URI ST_ASTIFF=factory.createURI(NAMESPACE, "ST_AsTIFF");
	public static final	URI ST_ASTOPOJSON=factory.createURI(NAMESPACE, "ST_AsTopoJSON");
	public static final	URI ST_ASJPG=factory.createURI(NAMESPACE, "ST_AsJPG");
	public static final	URI ST_ASLATLONTEXT=factory.createURI(NAMESPACE, "ST_AsLatLonText");
	public static final	URI ST_ASPNG=factory.createURI(NAMESPACE, "ST_AsPNG");
	public static final	URI ST_ASMVT=factory.createURI(NAMESPACE, "ST_AsMVT");
	public static final	URI ST_ASMVTGEOM=factory.createURI(NAMESPACE, "ST_AsMVTGeom");
	public static final	URI ST_ASSVG=factory.createURI(NAMESPACE, "ST_AsSVG");
	public static final	URI ST_ASTEXT=factory.createURI(NAMESPACE, "ST_AsText");
	public static final	URI ST_ASTEXTRAW=factory.createURI(NAMESPACE, "ST_AsTextRaw");
	public static final	URI ST_ASTEXTROUND=factory.createURI(NAMESPACE, "ST_AsTextRound");
	public static final	URI ST_ASTWKB=factory.createURI(NAMESPACE, "ST_AsTWKB");
	public static final	URI ST_ASWKB=factory.createURI(NAMESPACE, "ST_AsWKB");
	public static final	URI ST_ASWKT=factory.createURI(NAMESPACE, "ST_AsWKT");
	public static final	URI ST_ASX3D=factory.createURI(NAMESPACE, "ST_AsX3D");
	public static final	URI ST_AREA=factory.createURI(NAMESPACE, "ST_Area");
	public static final	URI ST_AREASIMILARITY=factory.createURI(NAMESPACE, "ST_AreaSimilarity");
	public static final	URI ST_AZIMUTH=factory.createURI(NAMESPACE, "ST_Azimuth");
	public static final	URI st_bboxabove =factory.createURI(NAMESPACE,"ST_BBOXAbove");
    public static final URI st_bboxbelow = factory.createURI(NAMESPACE,"ST_BBOXBelow");
    public static final	URI st_bboxcontains = factory.createURI(NAMESPACE,"ST_BBOXContains");
    public static final	URI st_bboxdistance = factory.createURI(NAMESPACE,"ST_BBOXDistance");
    public static final	URI st_bboxequals = factory.createURI(NAMESPACE, "ST_BBOXEquals");
    public static final	URI st_bboxfpintersects = factory.createURI(NAMESPACE, "ST_BBOXFPIntersects");
    public static final	URI st_bboxintersect = factory.createURI(NAMESPACE, "ST_BBOXIntersects");
    public static final	URI st_bboxiscontainedby =factory.createURI(NAMESPACE, "ST_BBOXIsContainedBy");
    public static final	URI st_bboxleftof = factory.createURI(NAMESPACE, "ST_BBOXLeftOf");
    public static final	URI st_bboxoverlapsabove = factory.createURI(NAMESPACE, "ST_BBOXOverlapsAbove");
    public static final	URI st_bboxoverlapsbelow =factory.createURI(NAMESPACE, "ST_BBOXOverlapsBelow");
    public static final	URI st_bboxoverlapsleft = factory.createURI(NAMESPACE ,"ST_BBOXOverlapsLeft");
    public static final	URI st_bboxoverlapsright = factory.createURI(NAMESPACE, "ST_BBOXOverlapsRight");
    public static final	URI st_bboxrightof = factory.createURI(NAMESPACE, "ST_BBOXRightOf");
	public static final	URI ST_BAND=factory.createURI(NAMESPACE, "ST_Band");
	public static final	URI ST_BANDMETADATA=factory.createURI(NAMESPACE, "ST_BandMetaData");
	public static final	URI ST_BANDNODATAVALUE=factory.createURI(NAMESPACE, "ST_BandNoDataValue");
	public static final	URI ST_BANDPIXELTYPE=factory.createURI(NAMESPACE, "ST_BandPixelType");
	public static final	URI ST_BEZIERSMOOTHING=factory.createURI(NAMESPACE, "ST_BezierSmoothing");
	public static final	URI ST_BOUNDARY=factory.createURI(NAMESPACE, "ST_Boundary");
	public static final	URI ST_BOUNDINGDIAGONAL=factory.createURI(NAMESPACE, "ST_BoundingDiagonal");
	public static final	URI ST_CENTROID=factory.createURI(NAMESPACE, "ST_Centroid");
	public static final	URI ST_CENTROIDDISTANCE=factory.createURI(NAMESPACE, "ST_CentroidDistance");
	public static final	URI ST_CHAIKINSMOOTHING=factory.createURI(NAMESPACE, "ST_ChaikinSmoothing");
	public static final	URI ST_CLIP=factory.createURI(NAMESPACE, "ST_Clip");
	public static final	URI ST_CLIPBYBOX2D=factory.createURI(NAMESPACE, "ST_ClipByBox2D");
	public static final	URI ST_CLOSESTPOINT=factory.createURI(NAMESPACE, "ST_ClosestPoint");
	public static final	URI ST_CLOSESTPOINTOFAPPROACH=factory.createURI(NAMESPACE, "ST_ClosestPointOfApproach");
	public static final	URI ST_CLUSTERINTERSECTING=factory.createURI(NAMESPACE, "ST_ClusterIntersecting");
	public static final	URI ST_CLUSTERKMEANS=factory.createURI(NAMESPACE, "ST_ClusterKMeans");
	public static final	URI ST_CLUSTERWITHIN=factory.createURI(NAMESPACE, "ST_ClusterWithin");
	public static final	URI ST_COLLECTIONHOMOGENIZE=factory.createURI(NAMESPACE, "ST_CollectionHomogenize");
	public static final	URI ST_COMPACTNESSRATIO=factory.createURI(NAMESPACE, "ST_CompactnessRatio");
	public static final	URI ST_CONCAVEHULL=factory.createURI(NAMESPACE, "ST_ConcaveHull");
	public static final	URI ST_CONTAINS=factory.createURI(NAMESPACE, "ST_Contains");
	public static final	URI ST_CONTAINSPROPERLY=factory.createURI(NAMESPACE, "ST_ContainsProperly");
	public static final	URI ST_CONVEXHULL=factory.createURI(NAMESPACE, "ST_ConvexHull");
	public static final	URI ST_COUNT=factory.createURI(NAMESPACE, "ST_Count");
	public static final	URI ST_CURVETOLINE=factory.createURI(NAMESPACE, "ST_CurveToLine");
	public static final	URI ST_DENSIFY=factory.createURI(NAMESPACE, "ST_Densify");
	public static final	URI ST_DELAUNAYTRIANGLES=factory.createURI(NAMESPACE, "ST_DelaunayTriangles");
	public static final	URI ST_DIMENSION=factory.createURI(NAMESPACE, "ST_Dimension");
	public static final	URI ST_DISTANCE=factory.createURI(NAMESPACE, "ST_Distance");
	public static final	URI ST_DISTANCE3D=factory.createURI(NAMESPACE, "ST_Distance3D");
	public static final	URI ST_DISTANCESPHERE=factory.createURI(NAMESPACE, "ST_DistanceSphere");
	public static final	URI ST_DWITHIN=factory.createURI(NAMESPACE, "ST_DWithin");;
	public static final	URI ST_ENDPOINT=factory.createURI(NAMESPACE, "ST_EndPoint");
	public static final	URI ST_EQUALS=factory.createURI(NAMESPACE, "ST_Equals");
	public static final	URI ST_EQUALSNORM=factory.createURI(NAMESPACE, "ST_EqualsNorm");
	public static final	URI ST_EQUALSTOPO=factory.createURI(NAMESPACE, "ST_EqualsTopo");
	public static final	URI ST_EQUALSRS=factory.createURI(NAMESPACE, "ST_EqualSRS");
	public static final	URI ST_EPSGTOSRID=factory.createURI(NAMESPACE, "ST_EPSGToSRID");
	public static final	URI ST_FILTERBYM=factory.createURI(NAMESPACE, "ST_FilterByM");
	public static final	URI ST_FILTERBYT=factory.createURI(NAMESPACE, "ST_FilterByT");
	public static final	URI ST_FLIPCOORDINATES=factory.createURI(NAMESPACE, "ST_FlipCoordinates");
	public static final URI st_equals=factory.createURI(NAMESPACE, "ST_Equals");
        public static final URI st_equalsNorm=factory.createURI(NAMESPACE, "ST_EqualNorm");
        public static final URI st_equalsTopo=factory.createURI(NAMESPACE, "ST_EqualTopo");
        public static final URI st_equalSRS=factory.createURI(NAMESPACE, "ST_EqualSRS");
        public static final URI st_epsgToSRID=factory.createURI(NAMESPACE, "ST_EPSGToSRID");
        public static final URI st_exteriorRing=factory.createURI(NAMESPACE, "ST_ExteriorRing");
        public static final URI st_filterByM=factory.createURI(NAMESPACE, "ST_FilterByM");
        public static final URI st_filterByT=factory.createURI(NAMESPACE, "ST_FilterByT");
        public static final URI st_flipCoordinates=factory.createURI(NAMESPACE, "ST_FlipCoordinates");
        public static final URI st_force2d=factory.createURI(NAMESPACE, "ST_Force2D");
        public static final URI st_force3d=factory.createURI(NAMESPACE, "ST_Force3D");
        public static final URI st_force3dm=factory.createURI(NAMESPACE, "ST_Force3DM");
        public static final URI st_force3dz=factory.createURI(NAMESPACE, "ST_Force3D");
        public static final URI st_force4d=factory.createURI(NAMESPACE, "ST_Force4D");
        public static final URI st_forceCollection=factory.createURI(NAMESPACE, "ST_ForceCollection");
        public static final URI st_forceCurve=factory.createURI(NAMESPACE, "ST_ForceCurve");
        public static final URI st_forceLHR=factory.createURI(NAMESPACE, "ST_ForceLHR");
        public static final URI st_forcePolygonCW=factory.createURI(NAMESPACE, "ST_ForcePolygonCW");
        public static final URI st_forcePolygonCCW=factory.createURI(NAMESPACE, "ST_ForcePolygonCCW");
        public static final URI st_forceSFS=factory.createURI(NAMESPACE, "ST_ForceSFS");
        public static final URI st_frechetDistance=factory.createURI(NAMESPACE, "ST_FrechetDistance");
        public static final URI st_generatePoints=factory.createURI(NAMESPACE, "ST_GeneratePoints");
        public static final URI st_geohash=factory.createURI(NAMESPACE, "ST_AsGeoHash");
        public static final URI st_geomFromGeoJSON=factory.createURI(NAMESPACE, "ST_GeomFromGeoJSON");
        public static final URI st_geomFromGeoHash=factory.createURI(NAMESPACE, "ST_GeomFromGeoHash");
        public static final URI st_geomFromGML=factory.createURI(NAMESPACE, "ST_GeomFromGML");
        public static final URI st_geomFromKML=factory.createURI(NAMESPACE, "ST_GeomFromKML");
        public static final URI st_geomFromWKB=factory.createURI(NAMESPACE, "ST_GeomFromWKB");
        public static final URI st_geomFromText=factory.createURI(NAMESPACE, "ST_GeomFromText");
        public static final URI st_geometricMedian=factory.createURI(NAMESPACE, "ST_GeometricMedian");
        public static final URI st_geometryN=factory.createURI(NAMESPACE, "ST_GeometryN");
        public static final URI st_geometryType=factory.createURI(NAMESPACE, "ST_GeometryType");
        public static final URI st_gmlToSQL=factory.createURI(NAMESPACE, "ST_GeomFromGML");
        public static final URI st_hasNoBand=factory.createURI(NAMESPACE, "ST_HasNoBand");
        public static final URI ST_hasHorizontalCRS=factory.createURI(NAMESPACE, "ST_HasHorizontalCRS");
        public static final URI st_hasRepeatedPoints=factory.createURI(NAMESPACE, "ST_HasRepeatedPoints");
        public static final URI st_height=factory.createURI(NAMESPACE, "ST_Height");
        public static final URI st_hausdorffDistance=factory.createURI(NAMESPACE, "ST_HausdorffDistance");
        public static final URI st_interiorRingN=factory.createURI(NAMESPACE, "ST_InteriorRingN");
        public static final URI st_interpolatePoint=factory.createURI(NAMESPACE, "ST_InterpolatePoint");
        public static final URI st_intersectionPercentage=factory.createURI(NAMESPACE, "ST_IntersectionPercentage");
        public static final URI st_is3D=factory.createURI(NAMESPACE, "ST_Is3D");
        public static final URI st_isCollection=factory.createURI(NAMESPACE, "ST_IsCollection");
        public static final URI st_isClosed=factory.createURI(NAMESPACE, "ST_IsClosed");
        public static final URI st_isConvex=factory.createURI(NAMESPACE, "ST_IsConvex");
        public static final URI st_isEmpty=factory.createURI(NAMESPACE, "ST_IsEmpty");
        public static final URI st_isLocationOnEdge=factory.createURI(NAMESPACE, "ST_IsLocationOnEdge");
        public static final URI st_isMeasured=factory.createURI(NAMESPACE, "ST_IsMeasured");
        public static final URI st_isMorePrecise=factory.createURI(NAMESPACE, "ST_IsMorePrecise");
        public static final URI st_isNodingValid=factory.createURI(NAMESPACE, "ST_IsNodingValid");
        public static final URI st_isPointOnLine=factory.createURI(NAMESPACE, "ST_IsPointOnLine");
        public static final URI st_isPointInRing=factory.createURI(NAMESPACE, "ST_IsPointInRing");
        public static final URI st_isPolygonCW=factory.createURI(NAMESPACE, "ST_IsPolygonCW");
        public static final URI st_isPolygonCCW=factory.createURI(NAMESPACE, "ST_IsPolygonCCW");
        public static final URI st_isRectangle=factory.createURI(NAMESPACE, "ST_IsRectangle");
        public static final URI st_isRing=factory.createURI(NAMESPACE, "ST_IsRing");
        public static final URI st_isSimple=factory.createURI(NAMESPACE, "ST_IsSimpleFF");
        public static final URI st_isValid=factory.createURI(NAMESPACE, "ST_IsValidFF");
        public static final URI st_isValidTrajectory=factory.createURI(NAMESPACE, "ST_IsValidTrajectory");
        public static final URI st_isValidReason=factory.createURI(NAMESPACE, "ST_IsValidReason");
        public static final URI st_isValidDetail=factory.createURI(NAMESPACE, "ST_IsValidDetail");
        public static final URI st_Length=factory.createURI(NAMESPACE, "ST_Length");
        public static final URI st_Length2D=factory.createURI(NAMESPACE, "ST_Length");
        public static final URI st_Length3D=factory.createURI(NAMESPACE, "ST_Length3D");
        public static final URI st_LengthToPoint=factory.createURI(NAMESPACE, "ST_LengthToPoint");
        public static final URI st_lineCrossingDirection=factory.createURI(NAMESPACE, "ST_LineCrossingDirection");
        public static final URI st_lineFromEncodedPolyline=factory.createURI(NAMESPACE, "ST_LineFromEncodedPolyline");
        public static final URI st_lineFromMultiPoint=factory.createURI(NAMESPACE, "ST_LineFromMultiPoint");
        public static final URI st_lineFromWKB=factory.createURI(NAMESPACE, "ST_LineFromWKB");
        public static final URI st_lineFromWKT=factory.createURI(NAMESPACE, "ST_LineFromText");
        public static final URI st_lineFromText=factory.createURI(NAMESPACE, "ST_LineFromText");
        public static final URI st_lineInterpolatePoint=factory.createURI(NAMESPACE, "ST_LineInterpolatePoint");
        public static final URI st_lineInterpolatePoints=factory.createURI(NAMESPACE, "ST_LineInterpolatePoints");
        public static final URI st_lineLocatePoint=factory.createURI(NAMESPACE, "ST_LineLocatePoint");
        public static final URI st_lineMerge=factory.createURI(NAMESPACE, "ST_LineMerge");
        public static final URI st_lineSelfIntersectionPoint=factory.createURI(NAMESPACE, "ST_LineSelfIntersectionPoint");
        public static final URI st_lineSubstring=factory.createURI(NAMESPACE, "ST_LineSubstring");
        public static final URI st_lineToCurve=factory.createURI(NAMESPACE, "ST_LineToCurve");
        public static final URI st_locateAlong=factory.createURI(NAMESPACE, "ST_LocateAlong");
        public static final URI st_locateBetween=factory.createURI(NAMESPACE, "ST_LocateBetween");
        public static final URI st_locateBetweenElevations=factory.createURI(NAMESPACE, "ST_LocateBetweenElevations");
        public static final URI st_longestLine=factory.createURI(NAMESPACE, "ST_LongestLine");
        public static final URI st_m=factory.createURI(NAMESPACE, "ST_M");
        public static final URI st_maxDistance=factory.createURI(NAMESPACE, "ST_MaxDistance");
        public static final URI st_maxDistance3D=factory.createURI(NAMESPACE, "ST_MaxDistance3D");
        public static final URI st_makeBox2D=factory.createURI(NAMESPACE, "ST_MakeBox2D");
        public static final URI st_makeBox3D=factory.createURI(NAMESPACE, "ST_MakeBox3D");
        public static final URI st_makeCircle=factory.createURI(NAMESPACE, "ST_MakeCircle");
        public static final URI st_makeEllipse=factory.createURI(NAMESPACE, "ST_MakeEllipse");
        public static final URI st_makeEmptyCoverage=factory.createURI(NAMESPACE, "ST_MakeEmptyCoverage");
        public static final URI st_makeEmptyRaster=factory.createURI(NAMESPACE, "ST_MakeEmptyRaster");
        public static final URI st_makeEnvelope=factory.createURI(NAMESPACE, "ST_MakeEnvelope");
        public static final URI st_makeLine=factory.createURI(NAMESPACE, "ST_MakeLine");
        public static final URI st_makePoint=factory.createURI(NAMESPACE, "ST_MakePoint");
        public static final URI st_makePointM=factory.createURI(NAMESPACE, "ST_MakePointM");
        public static final URI st_makePolygon=factory.createURI(NAMESPACE, "ST_MakePolygon");
        public static final URI st_makeValid=factory.createURI(NAMESPACE, "ST_MakeValid");
        public static final URI st_memsize=factory.createURI(NAMESPACE, "ST_MemSize");
        public static final URI st_minimumBoundingCircle=factory.createURI(NAMESPACE, "ST_MinimumBoundingCircle");
        public static final URI st_minimumBoundingCircleCenter=factory.createURI(NAMESPACE, "ST_MinimumBoundingCircleCenter");
        public static final URI st_minimumBoundingRadius=factory.createURI(NAMESPACE, "ST_MinimumBoundingRadius");
        public static final URI st_minimumClearance=factory.createURI(NAMESPACE, "ST_MinimumClearance");
        public static final URI st_minimumClearanceLine=factory.createURI(NAMESPACE, "ST_MinimumClearanceLine");
        public static final URI st_minimumDiameter=factory.createURI(NAMESPACE, "ST_MinimumDiameter");
        public static final URI st_minimumDiameterLine=factory.createURI(NAMESPACE, "ST_MinimumDiameterLine");
        public static final URI st_minimumRectangle=factory.createURI(NAMESPACE, "ST_MinimumRectangle");
        public static final URI st_minConvexHull=factory.createURI(NAMESPACE, "ST_MinConvexHull");
        public static final URI st_mLineFromText=factory.createURI(NAMESPACE, "ST_MLineFromText");
        public static final URI st_mMin=factory.createURI(NAMESPACE, "ST_MMin");
        public static final URI st_mMax=factory.createURI(NAMESPACE, "ST_MMax");
        public static final URI st_mPointFromText=factory.createURI(NAMESPACE, "ST_MPointFromText");
        public static final URI st_mPolyFromText=factory.createURI(NAMESPACE, "ST_MPolyFromText");
        public static final URI st_multi=factory.createURI(NAMESPACE, "ST_Multi");
        public static final URI st_multiplyz=factory.createURI(NAMESPACE, "ST_MultiplyZ");
        public static final URI st_nearestValue=factory.createURI(NAMESPACE, "ST_NearestValue");
        public static final URI st_numBands=factory.createURI(NAMESPACE, "ST_NumBands");
        public static final URI st_numGeometries=factory.createURI(NAMESPACE, "ST_NumGeometries");
        public static final URI st_numInteriorRings=factory.createURI(NAMESPACE, "ST_NumInteriorRings");
        public static final URI st_numPatches=factory.createURI(NAMESPACE, "ST_NumPatches");
        public static final URI st_numPoints=factory.createURI(NAMESPACE, "ST_NumPoints");
        public static final URI st_nDims=factory.createURI(NAMESPACE, "ST_NDims");
        public static final URI st_nPoints=factory.createURI(NAMESPACE, "ST_NumPoints");
        public static final URI st_nRings=factory.createURI(NAMESPACE, "ST_NRings");
        public static final URI st_node=factory.createURI(NAMESPACE, "ST_Node");
        public static final URI st_normalize=factory.createURI(NAMESPACE, "ST_Normalize");
        public static final URI st_octogonalEnvelope=factory.createURI(NAMESPACE, "ST_OctogonalEnvelope");
        public static final URI st_offsetCurve=factory.createURI(NAMESPACE, "ST_OffsetCurve");
        public static final URI st_orientation=factory.createURI(NAMESPACE, "ST_Orientation");
        public static final URI st_orderingEquals=factory.createURI(NAMESPACE, "ST_OrderingEquals");
        public static final URI st_osmlink=factory.createURI(NAMESPACE, "ST_AsOSMLink");
        public static final URI st_patchN=factory.createURI(NAMESPACE, "ST_PatchN");
        public static final URI st_partOfGeometryAfter=factory.createURI(NAMESPACE, "ST_PartOfGeometryAfter");
        public static final URI st_partOfGeometryBefore=factory.createURI(NAMESPACE, "ST_PartOfGeometryBefore");
        public static final URI st_perimeter=factory.createURI(NAMESPACE, "ST_Perimeter");
        public static final URI st_perimeter2D=factory.createURI(NAMESPACE, "ST_Perimeter");
        public static final URI st_perimeter3D=factory.createURI(NAMESPACE, "ST_Perimeter3D");
        public static final URI st_pixelAsCentroid=factory.createURI(NAMESPACE, "ST_PixelAsCentroid");
        public static final URI st_pixelAsCentroids=factory.createURI(NAMESPACE, "ST_PixelAsCentroids");
        public static final URI st_pixelAsPoint=factory.createURI(NAMESPACE, "ST_PixelAsPoint");
        public static final URI st_pixelAsPoints=factory.createURI(NAMESPACE, "ST_PixelAsPoints");
        public static final URI st_pixelAsPolygon=factory.createURI(NAMESPACE, "ST_PixelAsPolygon");
        public static final URI st_pixelAsPolygons=factory.createURI(NAMESPACE, "ST_PixelAsPolygons");
        public static final URI st_pixelHeight=factory.createURI(NAMESPACE, "ST_PixelHeight");
        public static final URI st_pixelOfValue=factory.createURI(NAMESPACE, "ST_PixelOfValue");
        public static final URI st_pixelWidth=factory.createURI(NAMESPACE, "ST_PixelWidth");
        public static final URI st_points=factory.createURI(NAMESPACE, "ST_Points");
        public static final URI st_pointN=factory.createURI(NAMESPACE, "ST_PointN");
        public static final URI st_pointFromGeoHash=factory.createURI(NAMESPACE, "ST_PointFromGeoHash");
        public static final URI st_pointFromWKB=factory.createURI(NAMESPACE, "ST_PointFromWKB");
        public static final URI st_pointFromText=factory.createURI(NAMESPACE, "ST_PointFromText");
        public static final URI st_pointInsideCircle=factory.createURI(NAMESPACE, "ST_PointInsideCircle");
        public static final URI st_pointOnSurface=factory.createURI(NAMESPACE, "ST_PointOnSurface");
        public static final URI st_polygon=factory.createURI(NAMESPACE, "ST_Polygon");
        public static final URI st_polygonize=factory.createURI(NAMESPACE, "ST_Polygonize");
        public static final URI st_polygonFromText=factory.createURI(NAMESPACE, "ST_PolygonFromText");
        public static final URI st_polygonFromWKB=factory.createURI(NAMESPACE, "ST_PolygonFromWKB");
        public static final URI st_precisionReducer=factory.createURI(NAMESPACE, "ST_PrecisionReducer");
        public static final URI st_rastFromWKB=factory.createURI(NAMESPACE, "ST_RastFromWKB");
        public static final URI st_rastFromHexWKB=factory.createURI(NAMESPACE, "ST_RastFromHexWKB");
        public static final URI st_rast_isEmpty=factory.createURI(NAMESPACE, "ST_IsEmpty");
        public static final URI st_rast_Contains=factory.createURI(NAMESPACE, "ST_Contains");
        public static final URI st_rast_Covers=factory.createURI(NAMESPACE, "ST_Covers");
        public static final URI st_rast_CoveredBy=factory.createURI(NAMESPACE, "ST_CoveredBy");
        public static final URI st_rast_Crosses=factory.createURI(NAMESPACE, "ST_Crosses");
        public static final URI st_rast_Disjoint=factory.createURI(NAMESPACE, "ST_Disjoint");
        public static final URI st_rast_Intersects=factory.createURI(NAMESPACE, "ST_Intersects");
        public static final URI st_rast_Intersection=factory.createURI(NAMESPACE, "ST_Intersection");
        public static final URI st_rast_Overlaps=factory.createURI(NAMESPACE, "ST_Overlaps");
        public static final URI st_rast_srid=factory.createURI(NAMESPACE, "ST_SRID");
        public static final URI st_rast_Touches=factory.createURI(NAMESPACE, "ST_Touches");
        public static final URI st_rast_Within=factory.createURI(NAMESPACE, "ST_Within");
        public static final URI st_rasterToWorldCoord=factory.createURI(NAMESPACE, "ST_RasterToWorldCoord");
        public static final URI st_rasterToWorldCoordX=factory.createURI(NAMESPACE, "ST_RasterToWorldCoordX");
        public static final URI st_rasterToWorldCoordY=factory.createURI(NAMESPACE, "ST_RasterToWorldCoordY");
        public static final URI st_reflect=factory.createURI(NAMESPACE, "ST_Reflect");
        public static final URI st_relate=factory.createURI(NAMESPACE, "ST_Relate");
        public static final URI st_relateMatch=factory.createURI(NAMESPACE, "ST_RelateMatch");
        public static final URI st_removePoint=factory.createURI(NAMESPACE, "ST_RemovePoint");
        public static final URI st_removePoints=factory.createURI(NAMESPACE, "ST_RemovePoints");
        public static final URI st_removeRepeatedPoints=factory.createURI(NAMESPACE, "ST_RemoveRepeatedPoints");
        public static final URI st_reskew=factory.createURI(NAMESPACE, "ST_Reskew");
        public static final URI st_resize=factory.createURI(NAMESPACE, "ST_Resize");
        public static final URI st_retile=factory.createURI(NAMESPACE, "ST_Retile");
        public static final URI st_reverse=factory.createURI(NAMESPACE, "ST_Reverse");
        public static final URI st_rotate=factory.createURI(NAMESPACE, "ST_Rotate");
        public static final URI st_rotateX=factory.createURI(NAMESPACE, "ST_RotateX");
        public static final URI st_rotateY=factory.createURI(NAMESPACE, "ST_RotateY");
        public static final URI st_rotateZ=factory.createURI(NAMESPACE, "ST_RotateZ");
        public static final URI st_scale=factory.createURI(NAMESPACE, "ST_Scale");
        public static final URI st_scaleX=factory.createURI(NAMESPACE, "ST_ScaleX");
        public static final URI st_scaleY=factory.createURI(NAMESPACE, "ST_ScaleY");
        public static final URI st_shearTransformation=factory.createURI(NAMESPACE, "ST_ShearTransformation");
        public static final URI st_segmentize=factory.createURI(NAMESPACE, "ST_Segmentize");
        public static final URI st_setPoint=factory.createURI(NAMESPACE, "ST_SetPoint");
        public static final URI st_setSRID=factory.createURI(NAMESPACE, "ST_SetSRID");
        public static final URI st_simplify=factory.createURI(NAMESPACE, "ST_Simplify");
        public static final URI st_simplifyPreserveTopology=factory.createURI(NAMESPACE, "ST_SimplifyPreserveTopology");
        public static final URI st_simplifyVW=factory.createURI(NAMESPACE, "ST_SimplifyVW");
        public static final URI st_sharedPaths=factory.createURI(NAMESPACE, "ST_SharedPaths");
        public static final URI st_shiftLongitude=factory.createURI(NAMESPACE, "ST_ShiftLongitude");
        public static final URI st_shortestLine=factory.createURI(NAMESPACE, "ST_ShortestLine");
        public static final URI st_shortestLine3D=factory.createURI(NAMESPACE, "ST_ShortestLine3D");
        public static final URI st_skewX=factory.createURI(NAMESPACE, "ST_SkewX");
        public static final URI st_skewY=factory.createURI(NAMESPACE, "ST_SkewY");
        public static final URI st_snap=factory.createURI(NAMESPACE, "ST_Snap");
        public static final URI st_split=factory.createURI(NAMESPACE, "ST_Split");
        public static final URI st_srid=factory.createURI(NAMESPACE, "ST_GetSRIDFF");
        public static final URI st_sridToEPSG=factory.createURI(NAMESPACE, "ST_SRIDToEPSG");
        public static final URI st_startPoint=factory.createURI(NAMESPACE, "ST_StartPoint");
        public static final URI st_straightSkeleton=factory.createURI(NAMESPACE, "ST_StraightSkeleton");
        public static final URI st_summary=factory.createURI(NAMESPACE, "ST_Summary");
        public static final URI st_swapOrdinates=factory.createURI(NAMESPACE, "ST_SwapOrdinates");
        public static final URI st_symDifference=factory.createURI(NAMESPACE, "ST_SymDifference");
        public static final URI st_tesselate=factory.createURI(NAMESPACE, "ST_Tesselate");
        public static final URI st_t=factory.createURI(NAMESPACE, "ST_T");
        public static final URI st_tMin=factory.createURI(NAMESPACE, "ST_TMin");
        public static final URI st_tMax=factory.createURI(NAMESPACE, "ST_TMax");
        public static final URI st_transscale=factory.createURI(NAMESPACE, "ST_TransScale");
        public static final URI st_translate=factory.createURI(NAMESPACE, "ST_Translate");
        public static final URI st_transform=factory.createURI(NAMESPACE, "ST_Transform");
        public static final URI st_union=factory.createURI(NAMESPACE, "ST_Union");
        public static final URI st_unaryUnion=factory.createURI(NAMESPACE, "ST_UnaryUnion");
        public static final URI st_upperLeftX=factory.createURI(NAMESPACE, "ST_UpperLeftX");
        public static final URI st_upperLeftY=factory.createURI(NAMESPACE, "ST_UpperLeftY");
        public static final URI st_vectorize=factory.createURI(NAMESPACE, "ST_Vectorize");
        public static final URI st_voronoiLines=factory.createURI(NAMESPACE, "ST_VoronoiLines");
        public static final URI st_voronoiPolygons=factory.createURI(NAMESPACE, "ST_VoronoiPolygons");
        public static final URI st_width=factory.createURI(NAMESPACE, "ST_Width");
        public static final URI st_wkbToSQL=factory.createURI(NAMESPACE, "ST_GeomFromWKB");
        public static final URI st_wktToSQL=factory.createURI(NAMESPACE, "ST_GeomFromText");
        public static final URI st_worldToRasterCoord=factory.createURI(NAMESPACE, "ST_WorldToRasterCoord");
        public static final URI st_worldToRasterCoordX=factory.createURI(NAMESPACE, "ST_WorldToRasterCoordX");
        public static final URI st_worldToRasterCoordY=factory.createURI(NAMESPACE, "ST_WorldToRasterCoordY");
        public static final URI st_x=factory.createURI(NAMESPACE, "ST_X");
        public static final URI st_xMin=factory.createURI(NAMESPACE, "ST_XMin");
        public static final URI st_xMax=factory.createURI(NAMESPACE, "ST_XMax");
        public static final URI st_y=factory.createURI(NAMESPACE, "ST_Y");
        public static final URI st_yMin=factory.createURI(NAMESPACE, "ST_YMin");
        public static final URI st_yMax=factory.createURI(NAMESPACE, "ST_YMax");
        public static final URI st_z=factory.createURI(NAMESPACE, "ST_Z");
        public static final URI st_zMin=factory.createURI(NAMESPACE, "ST_ZMin");
        public static final URI st_zMax=factory.createURI(NAMESPACE, "ST_ZMax");
        public static final URI st_zmFlag=factory.createURI(NAMESPACE, "ST_Zmflag");
		
        public static final String WKB = "WKB";
        public static final String GeoJSON = "GeoJSON";
        public static final String GeoJSONLD = "GeoJSONLD";
        public static final String GeoHash = "GeoHash";
        public static final String GeoBuf = "GeoBuf";
        public static final String GeoURI="GeoURI";
        public static final String GeoRSS="GeoRSS";
        public static final String GMLCOV="GMLCOV";
        public static final String KML = "KML";
        public static final String WKBRaster = "WKBRaster";
        public static final String GEOTIFF = "GeoTIFF";
        public static final String EncodedPolyline = "EncodedPolyline";
        public static final String Polyshape= "Polyshape";
        public static final String TWKB = "TWKB";
        public static final String HEXWKB = "HEXWKB";
        public static final String DXF="DXF";
        public static final String MVT = "MVT";
        public static final String X3D = "X3D";
        public static final String OSM= "OSM";
        public static final String HexWKBRaster = "HexWKBRaster";
        public static final String TopoJSON = "TopoJSON";
        public static final String TemporalRange="TemporalRange";
        public static final String CoverageJSON = "CoverageJSON";

		public static final String SVG="SVG";

		public static final String NETCDF="NetCDF";

    }
}
