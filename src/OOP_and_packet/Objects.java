package OOP_and_packet;

public class Objects {
        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

        private int x;
        private int y;
        private Direction direction;

        public Objects(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            switch (direction) {
                case UP:
                    direction = Direction.LEFT;
                    break;
                case DOWN:
                    direction = Direction.RIGHT;
                    break;
                case LEFT:
                    direction = Direction.DOWN;
                    break;
                case RIGHT:
                    direction = Direction.UP;
                    break;
            }
        }

        public void turnRight() {
            switch (direction) {
                case UP:
                    direction = Direction.RIGHT;
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.UP;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    break;
            }
        }

        public void stepForward() {
            switch (direction) {
                case UP:
                    y++;
                    break;
                case DOWN:
                    y--;
                    break;
                case LEFT:
                    x--;
                    break;
                case RIGHT:
                    x++;
                    break;
            }
        }

        public static void moveRobot(Objects robot, int toX, int toY) {

            while (robot.getX() != toX) {
                if (robot.getX() < toX) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnLeft();
                    }
                }
                robot.stepForward();
            }


            while (robot.getY() != toY) {
                if (robot.getY() < toY) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                } else {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnLeft();
                    }
                }
                robot.stepForward();
            }
        }

        public static void main(String[] args) {
            Objects robot = new Objects(6, 12, Direction.UP);
            moveRobot(robot, 5, 2);
            System.out.println(robot.getX() + " " + robot.getY());
        }
}
//2.1.8