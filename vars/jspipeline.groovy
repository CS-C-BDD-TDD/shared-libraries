#!/usr/bin/env groovy

def call()
{
  pipeline {
      agent any

      stages {
          stage('Build') {
              steps {
                  echo "in js build stage"
              }
          }
          stage('Test') {
              steps {
                  echo "in js test stage"
              }
          }
          stage('Deliver') {
              steps {
                  echo "in js delivery stage"
              }
          }
      }
  }
}
