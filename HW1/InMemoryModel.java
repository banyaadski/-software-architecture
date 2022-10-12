package HW1;

import java.lang.ProcessBuilder.Redirect.Type;

import HW1.ModelElements.*;

class InMemoryModel<Type> implements IModelChanger {
    public class ModelStore {
        public PoligonalModel Models;
        public Scene Scenes;
        public Flash Flaches;
        public Camera Cameras;
        private IModelChangeObserver changeObservers;

        public Scene GetScene(int p) {
            Scene sceneOne = new Scene();
            return sceneOne;
        }

        public void NotifyChange(IModelChanger x) {

        }

    }


    interface IModelChangeObserver {
        public void ApplyUpdateModel();

    }

}

class ModelElements<Point3D, Angle3D, Color> {

    class Scene {
        public int Id;
        public PoligonalModel Models;
        public Flash Flaches;

        public Type method1(Type a) {
            return a;
        }

        public Type method2(Type b, Type c) {
            return b;
        }
    }

    /**
     * PoligonalModel
     */
    class PoligonalModel {
        public Poligon Poligons;
        public Texture Textures;

    }

    public class Poligon {
        public Point3D Points;
    }

    class Texture {

    }

    class Flash {
        public Point3D Location;
        public Angle3D Angle;
        public Color Color;
        public Float Power;

        public void Rotate(Angle3D a) {

        }

        public void Move(Point3D b) {

        }
    }

    class Camera {
        public Point3D Location;
        public Angle3D Angle;

        public void Rotate(Angle3D a) {

        }

        public void Move(Point3D b) {

        }

    }
}