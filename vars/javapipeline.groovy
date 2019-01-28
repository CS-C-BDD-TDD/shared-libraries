#!/usr/bin/env groovy

def call()
{
  pipeline {
      agent any

      stages {
          stage('Build') {
              steps {
                  echo "in java build stage"
              }
          }
          stage('Test') {
              steps {
                  echo "in java test stage"
              }
          }
          stage('Deliver') {
              steps {
                  echo "in java delivery stage"
              }
          }
      }
  }
}
