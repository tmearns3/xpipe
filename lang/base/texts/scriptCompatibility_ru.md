## Совместимость сценариев

Тип оболочки управляет тем, где этот скрипт может быть запущен.
Помимо точного совпадения, то есть запуска `zsh` скрипта в `zsh`, XPipe также включает более широкую проверку совместимости.

### Posix Shells

Любой скрипт, объявленный как `sh`, может быть запущен в любой среде posix-оболочки, такой как `bash` или `zsh`.
Если ты собираешься запускать основной скрипт на множестве различных систем, то использование только скриптов с синтаксисом `sh` - лучшее решение для этого.

### PowerShell

Скрипты, объявленные как обычные скрипты `powershell`, также могут выполняться в окружении `pwsh`.
