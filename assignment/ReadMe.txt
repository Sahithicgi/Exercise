For Rest API : Springboot(Java Framework) is used and the api is exposed on port 8080.

Step 1: Containerize the application
This step involves creating a Dockerfile (which is present with name "DockerFile")
which is a configuration
file that specifies how to build a Docker image of your application.
The Dockerfile describes the base image, copies the necessary files, and defines the
commands to run when the container starts.
The purpose of containerization is to encapsulate the application and its dependencies into a portable and self-contained unit called a Docker image.

Step 2: Build the Docker image

Once we have the Dockerfile in place, we need to build the Docker image using the docker build command.
This command reads the instructions in the Dockerfile and builds an image based on those instructions.
The result is a Docker image that contains the application code, dependencies, and runtime environment.

Run the following command in the project directory to build the Docker image :
docker build -t time-api .


Step 3 : Push the Docker image to a container registry: Choose a container registry provider (e.g., Docker Hub, Google Container Registry, Azure Container Registry) and push the image to the registry.

Step 4 : Deploy to Kubernetes:

Apply the deployment and service YAML files: Run the following command to deploy the application to Kubernetes :

kubectl apply -f deployment.yaml








