# Example edit
echo "// CI Build verification commit" >> src/main/java/com/example/App.java
git add .
git commit -m "Updated code to test Jenkins Poll SCM continuous build"
git push origin main
