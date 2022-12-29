
def newDownload(repo)
{
  git "https://github.com/dinesh367/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
