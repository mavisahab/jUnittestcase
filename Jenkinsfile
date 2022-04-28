pipeline { 
 agent any 
 stages { 
  stage('Testing') { 
   steps{ 
       echo 'running Tests' 
       bat 'lab.py' 
    } 
  }
  stage('Build') { 
   steps { 
    echo 'Building jar files...' 
    
   } 
  } 
 } 
}
