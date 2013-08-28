INSTRUCTIONS

CLIENT
input/input.xml - insert method attribute to specify the method to be used by the client
                  -options: raytraceurl,raytrace,raytracesubview,raytracemovie,parallel4,parallel2

       
parallel4 - splits image into first 4 rectangles in the xml and runs subview on each
parallel2 - splits image into first 2 rectangles in the xml and runs subview on each

RayTracerClient.java - Fill in the Configuration Settings block at the top of the file
build.xml - change the axis2.home to local machine


SERVER
RayTracerSkeleton.java - Fill in the Configuration Settings block at the top of the file
build.xml - change the axis2.home to local machine