import os

# converts groupId like com.example and artifact id like demo into a string com/example/hello 
directory = '{{cookiecutter.__packfile}}'

# create typical maven directory structure
os.makedirs(directory, exist_ok=True)

# move Main.java to Maven sources
os.rename("{{cookiecutter.name}}.java", directory + '/{{cookiecutter.name}}.java')