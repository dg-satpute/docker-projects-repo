# Use Python 3.7 image as the base image
FROM python:3.7-slim

# Set the working directory in the container
WORKDIR /app

# Copy the requirements file into the container
COPY /python-flask-app-02/requirements.txt /app/

# Install dependencies
RUN pip install --no-cache-dir -r python-flask-app-02/requirements.txt

# Copy the rest of the application code into the container
COPY ./python-flask-app-02/ /app/

# Expose the port that the Flask app will run on
EXPOSE 5000

# Set the command to run the Flask app
CMD ["python", "app.py"]
